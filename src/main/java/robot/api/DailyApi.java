package robot.api;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class DailyApi {

    public void getDaily() throws IOException {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String time = simpleDateFormat.format(today);
        System.out.println("日常时间================================"+time);
        if(time.equals("00:00:00")){
            System.out.println("time到了================================"+time);
            for(int i = 1; i<7; i++){
                //签到
                JSONObject check = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/check-in","idol_id="+i,"GET");
                //看视频
                JSONObject assistLook = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/assist","idol_id="+i+"&type=2","GET");
                //点赞视频
                JSONObject praise = this.dailyTask("https://starmicro.happyelements.cn/v1/praise/praise","type=3&id=945&status=1&idol_id="+i,"POST");
                //评论视频 需要三次
                JSONObject commentOne = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                JSONObject commentTwo = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                JSONObject commentThree = this.dailyTask("https://starmicro.happyelements.cn/v1/comment/comment","content=打卡&id=945&type=1&pid=0&idol_id="+i,"POST");
                //分享视频
                JSONObject assistShare = this.dailyTask("https://starmicro.happyelements.cn/v1/assist/assist","idol_id="+i+"&type=5","GET");
                //点赞2个帖子 两次
                JSONObject praiseForumOne = this.dailyTask("https://starmicro.happyelements.cn/v2/praise/praise-forum","id=48434&status=1&idol_id="+i+"&is_mission=1","POST");
                JSONObject praiseForumTwo = this.dailyTask("https://starmicro.happyelements.cn/v2/praise/praise-forum","id=48434&status=1&idol_id="+i+"&is_mission=1","POST");
                //关注2个用户 四次
                JSONObject followUserOne = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserTwo = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserThree = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                JSONObject followUserFour = this.dailyTask("https://starmicro.happyelements.cn/v2/follow/follow-user","target_uid=17986&is_mission=1&idol_id="+i,"POST");
                System.out.println("签到"+check+"歌姬id="+i);
                System.out.println("看视频"+assistLook+"歌姬id="+i);
                System.out.println("点赞视频"+praise+"歌姬id="+i);
                System.out.println("评论视频1"+commentOne+"歌姬id="+i);
                System.out.println("评论视频2"+commentTwo+"歌姬id="+i);
                System.out.println("评论视频3"+commentThree+"歌姬id="+i);
                System.out.println("分享视频"+assistShare+"歌姬id="+i);
                System.out.println("点赞2个帖子1"+praiseForumOne+"歌姬id="+i);
                System.out.println("点赞2个帖子2"+praiseForumTwo+"歌姬id="+i);
                System.out.println("关注2个用户1"+followUserOne+"歌姬id="+i);
                System.out.println("关注2个用户2"+followUserTwo+"歌姬id="+i);
                System.out.println("关注2个用户3"+followUserThree+"歌姬id="+i);
                System.out.println("关注2个用户4"+followUserFour+"歌姬id="+i);
            }
        }

    }

    //自动签到打卡
    public JSONObject dailyTask(String url,String param,String method) throws IOException {
        JSONObject data = new JSONObject();
        if(method=="GET"){
            String get=this.sendGet(url, param);
            System.out.println("get========================"+get);
        }else{
            String post = this.sendPost(url,param);
            System.out.println("post========================"+post);
        }

        return data;
    }
    //GET
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("authorization","Miinno bwn8I2SuG72FCXAzEAnCLYVof0qtn88A_1554773225");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    //POST
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("authorization","Miinno bwn8I2SuG72FCXAzEAnCLYVof0qtn88A_1554773225");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}
