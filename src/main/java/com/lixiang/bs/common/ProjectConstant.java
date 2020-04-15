package com.lixiang.bs.common;

/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.lixiang.bs";//基础包名称

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".entity";//生成的Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";//Controller所在包
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".common.base.mapper.Mapper";//Mapper接口
}
