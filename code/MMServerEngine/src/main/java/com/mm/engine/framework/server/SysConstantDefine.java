package com.mm.engine.framework.server;

/**
 * Created by a on 2016/8/12.
 */
public final class SysConstantDefine {
    // ------------------------------------------------------------------------------------------------一些key标记
    public static final String controller = "controller";
    public static final String opcodeKey = "opcode";
    // -------------------------------------------------------------------------------------------------NetEvent------------------------
    public static final int CACHEUPDATE = 1000; // 缓存更新
    public static final int LOCKKEYSANDCHECK = 1001; // 加锁并校验版本等
    public static final int UNLOCKKEYS = 1002; //解锁
    public static final int ASYNCDATA = 1003; // 异步更新数据
    public static final int LOCKKEYS = 1004; // 加锁
    public static final int GETASYNCDATABELONGLISTKEY = 1005; // 从异步数据更新从DB获取的list
    public static final int TellMainServerSelfInfo = 1006; // 通知mainServer自己的服务器信息
    public static final int TellServersNewInfo = 1007; // 通知其它服务器新增了服务器
    public static final int checkJobId = 1008; // 检查job的id,返回是否插入当前jobId
    public static final int removeJobOnServer = 1008; // 通知job所在服务器,删除一个job
    // -----------------------------------------------------------------------------------------------返回客户端特殊数据包的operCode
    public static final int NULLOBJCE = 1100; // 数据处理函数返回null
    // ------------------------------------------------------------------------------------------------------编码String
    public static final String utf_8 = "UTF-8";
    // --------------------------------------------------------------------------------------------------------event
    public static final int Event_NettyServerClient = 1201;
    public static final int Event_EntranceStart = 1202; // 入口启动完成
    public static final int Event_ServerStart = 1203; // server启动完成
    // ----------------------------------------------------------------------------------------monitorService conditions
    public static final String NetEventServiceStart = "NetEventServiceStart";
}
