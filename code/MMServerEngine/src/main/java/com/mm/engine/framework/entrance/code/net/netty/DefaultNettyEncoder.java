package com.mm.engine.framework.entrance.code.net.netty;

import com.mm.engine.framework.server.SysConstantDefine;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;

/**
 * Created by a on 2016/8/29.
 */
public class DefaultNettyEncoder extends MessageToByteEncoder {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(o);
        out.flush();
        out.close(); // 这个是否能重复用？
        byte[] nb = bos.toByteArray();
        byteBuf.writeInt(nb.length);
        byteBuf.writeBytes(nb);
    }
}