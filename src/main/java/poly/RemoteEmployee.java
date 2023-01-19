package poly;

public interface RemoteEmployee{
    void workFromHome();
    void attendDailyMeetingsFromHome();

    static boolean isRemote(){
        return true;
    }
}
