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
     * @version:2017��9��22�� ����10:23:07  
     * com.kp.test.Testsms.java 
     * @Desc  
     */  
    public class SMSDemo {  
        public static String YourSMSTemplateCode="SMS_106895135";//����ģ��code  ��Ҫ�޸�  
        public static String YourSignName="Т��";//����ǩ�����ƣ� ��Ҫ�޸�  
        public static String phone1="15772438300";//�ֻ�������Ҫ�޸�  
        public static String YourAccessId="LTAIi0nt7WWMoO9U";//��Ҫ�޸�  
        public static String YourAccessKeySecret="czhgqIVFKO2TCJgepx95ZVLDy1mVnZ";//��Ҫ�޸�  
        public static String product = "Dysmsapi";//����API��Ʒ���ƣ����Ų�Ʒ���̶��������޸ģ�  
        public static String domain = "dysmsapi.aliyuncs.com";//����API��Ʒ�������ӿڵ�ַ�̶��������޸ģ�  
          
        public static void main(String[] args) throws ServerException, ClientException {  
            send();  
        }  
      
        private static void send() throws ServerException, ClientException {  
            //���ó�ʱʱ��-�����е���  
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");  
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");  
            //��ʼ��ascClient��Ҫ�ļ�������  
              
            //��ʼ��ascClient,��ʱ��֧�ֶ�region  
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", YourAccessId,  
                    YourAccessKeySecret);  
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);  
            IAcsClient acsClient = new DefaultAcsClient(profile);  
             //��װ�������  
             SendSmsRequest request = new SendSmsRequest();  
             //ʹ��post�ύ  
             request.setMethod(MethodType.POST);  
             //����:�������ֻ��š�֧���Զ��ŷָ�����ʽ�����������ã���������Ϊ1000���ֻ�����,������������ڵ������ü�ʱ�������ӳ�,��֤�����͵Ķ����Ƽ�ʹ�õ������õķ�ʽ  
             request.setPhoneNumbers(phone1);  
             //����:����ǩ��-���ڶ��ſ���̨���ҵ�  
             request.setSignName(YourSignName);  
             //����:����ģ��-���ڶ��ſ���̨���ҵ�  
             request.setTemplateCode(YourSMSTemplateCode);  
             //��ѡ:ģ���еı����滻JSON��,��ģ������Ϊ"�װ���${name},������֤��Ϊ${code}"ʱ,�˴���ֵΪ  
             //������ʾ:���JSON����Ҫ�����з�,����ձ�׼��JSONЭ��Ի��з���Ҫ��,������������а���\r\n�������JSON����Ҫ��ʾ��\\r\\n,����ᵼ��JSON�ڷ���˽���ʧ��  
             request.setTemplateParam("{\"name\":\"Tom\",\"code\":\"123\"}");  
             //��ѡ-���ж�����չ��(�����������û�����Դ��ֶ�)  
             //request.setSmsUpExtendCode("90997");  
             //��ѡ:outIdΪ�ṩ��ҵ����չ�ֶ�,�����ڶ��Ż�ִ��Ϣ�н���ֵ���ظ�������  
             //request.setOutId("yourOutId");  
            //����ʧ���������ClientException�쳣  
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);  
              
            System.out.println("sendSmsResponse:"+sendSmsResponse);  
            //sendSmsResponse:com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse@6e811049  
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {  
            //����ɹ�  
                System.out.println("sendSmsResponse.getCode()"+sendSmsResponse.getCode());  
            }
            else{
            	System.out.println("false "+sendSmsResponse.getCode());
            }
        }  
          
          
      
          
          
    }  