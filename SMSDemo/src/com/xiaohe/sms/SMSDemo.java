    package com.xiaohe.sms;  
      
    import com.aliyuncs.DefaultAcsClient;  
    import com.aliyuncs.IAcsClient;  
    import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;  
    import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;  
    import com.aliyuncs.exceptions.ClientException;  
    import com.aliyuncs.exceptions.ServerException;  
    import com.aliyuncs.http.MethodType;  
    import com.aliyuncs.profile.DefaultProfile;  
    import com.aliyuncs.profile.IClientProfile;  
      
    /**  
     * @author: py 
     * @version:2017年9月22日 上午10:23:07  
     * com.kp.test.Testsms.java 
     * @Desc  
     */  
    public class SMSDemo {  
        public static String YourSMSTemplateCode="SMS_106895135";//短信模板code  需要修改  
        public static String YourSignName="孝和";//短信签名名称， 需要修改  
        public static String phone1="15772438300";//手机号码需要修改  
        public static String YourAccessId="LTAIi0nt7WWMoO9U";//需要修改  
        public static String YourAccessKeySecret="czhgqIVFKO2TCJgepx95ZVLDy1mVnZ";//需要修改  
        public static String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）  
        public static String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）  
          
        public static void main(String[] args) throws ServerException, ClientException {  
            send();  
        }  
      
        private static void send() throws ServerException, ClientException {  
            //设置超时时间-可自行调整  
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");  
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");  
            //初始化ascClient需要的几个参数  
              
            //初始化ascClient,暂时不支持多region  
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", YourAccessId,  
                    YourAccessKeySecret);  
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);  
            IAcsClient acsClient = new DefaultAcsClient(profile);  
             //组装请求对象  
             SendSmsRequest request = new SendSmsRequest();  
             //使用post提交  
             request.setMethod(MethodType.POST);  
             //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式  
             request.setPhoneNumbers(phone1);  
             //必填:短信签名-可在短信控制台中找到  
             request.setSignName(YourSignName);  
             //必填:短信模板-可在短信控制台中找到  
             request.setTemplateCode(YourSMSTemplateCode);  
             //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为  
             //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败  
             request.setTemplateParam("{\"name\":\"Tom\",\"code\":\"123\"}");  
             //可选-上行短信扩展码(无特殊需求用户请忽略此字段)  
             //request.setSmsUpExtendCode("90997");  
             //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者  
             //request.setOutId("yourOutId");  
            //请求失败这里会抛ClientException异常  
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);  
              
            System.out.println("sendSmsResponse:"+sendSmsResponse);  
            //sendSmsResponse:com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse@6e811049  
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {  
            //请求成功  
                System.out.println("sendSmsResponse.getCode()"+sendSmsResponse.getCode());  
            }
            else{
            	System.out.println("false "+sendSmsResponse.getCode());
            }
        }  
          
          
      
          
          
    }  