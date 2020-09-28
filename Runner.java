public class Runner {

   public static void main(String[] args) {
      LogMessage message1 = new LogMessage("CLIENT3:security alert – repeated login failures");
      LogMessage message2 = new LogMessage("Webserver:disk offline");
      LogMessage message3 = new LogMessage("SERVER1:file not found");
      LogMessage message4 = new LogMessage("SERVER2:read error on disk DSK1");
      LogMessage message5 = new LogMessage("SERVER1:write error on disk DSK2");
      LogMessage message6 = new LogMessage("Webserver:error on /dev/disk");
   }
    
}