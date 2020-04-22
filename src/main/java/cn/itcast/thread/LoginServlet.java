package cn.itcast.thread;
//模拟一个Servlet
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    //解决线程安全
    synchronized public static void doPost(String username,String password){

        try {
            usernameRef=username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef=password;
            System.out.println("username="+usernameRef+", password="+passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
