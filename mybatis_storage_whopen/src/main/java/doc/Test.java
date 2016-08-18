package doc;

import doc.dao.DocApiMapper;

import doc.dao.DocFunctionMapper;
import doc.dao.DocParamMapper;
import doc.dao.DocStorageMapMapper;
import doc.daoImpl.DocApiMapperImpl;

import doc.daoImpl.DocFunctionMapperImpl;
import doc.daoImpl.DocParamMapperImpl;
import doc.daoImpl.DocStorageMapMapperImpl;
import doc.meta.DocApi;

import doc.meta.DocFunction;
import doc.meta.DocParam;

/**
 * Created by robin on 16/8/18.
 */
public class Test {
    static DocFunctionMapper functionMapper=new DocFunctionMapperImpl();
    static DocApiMapper apiMapper=new DocApiMapperImpl();
    static DocStorageMapMapper diffMapMapper=new DocStorageMapMapperImpl();
    static DocParamMapper paramMapper=new DocParamMapperImpl();


    public static void main(String[] args){
      test1();
    }

    static void test1(){
        DocFunction  function=new DocFunction();
        function.setId(1);
        function.setName("采购单功能点");
        function.setDescripe("采购单功能点描述");
        System.out.println(functionMapper.insert(function));


        DocApi api=new DocApi();
        api.setId(1);
        api.setName("采购单推送接口");
        api.setDocFunctionId(1);
        api.setApplicationScemarios("网易发起采购流程，将采购详情以采购单形式通知仓库");
        api.setInterationFlow("网易调用wms接口");
        api.setReturnResult("{\"success\":true/false,  //bool类型" +
                "\"error_code\":wms返回的错误码" +
                "" +
                "" +
                "" +
                "}");
        api.setReturnExplain("此处的［失败原因］请第三方wms结合自身系统及仓库实操作提供网易一份列表");
        api.setSpecification("1、若采购单中的sku还未注册，新建sku对象 2、约定一张采购单的货物倒库后，wms方返回一张入库回调");
        System.out.println(apiMapper.insert(api));


        DocApi api2=new DocApi();
        api2.setId(2);
        api2.setName("订单推送接口");
        api2.setDocFunctionId(1);
        api2.setApplicationScemarios("用户在网易商城下单，网易通知仓库根据订单发货");
        api2.setInterationFlow("网易调用wms接口");
        api2.setReturnResult("{\"success\":true/false,  //bool类型" +
                "\"error_code\":wms返回的错误码" +
                "" +
                "" +
                "" +
                "}");
        api2.setReturnExplain("此处的［失败原因］请第三方wms结合自身系统及仓库实操作提供网易一份列表");
        api2.setSpecification("1、订单下单时若sku已经库存不足，wms返回true 2、发现推送同一个订单，返回首次的返回值");
        System.out.println(apiMapper.insert(api2));




//        DocDiffMap diffMap=new DocDiffMap();
//        diffMap.setId(2);
//        diffMap.setApiId(2);
//        diffMap.setParamId(2);
//        diffMap.setStorageId(2);
//        System.out.println(diffMapMapper.insert(diffMap));
//
//        DocParam param=new DocParam();
//        param.setId(2);
//        param.setDocApiId(2);
//        param.setVarDescripe("2ddd");
//        param.setVarType("ddd2ddddd");
//        param.setHasChild((byte)2);
//        param.setOrderNo(2);
//        param.setIsall((byte)2);
//        System.out.println(paramMapper.insert(param));
    }


    static void test2(){
        DocFunction function=functionMapper.selectByPrimaryKey(1);
        System.out.println(function.getName());
    }
}
