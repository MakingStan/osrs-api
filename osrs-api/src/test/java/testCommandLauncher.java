import api.osrs.OsrsApi;

public class testCommandLauncher {

    public static void main(String[] args) throws Exception
    {
        System.out.println(OsrsApi.RealTimePrices.getlowPrice(821));
    }
}
