import api.osrs.OsrsApi;

import java.util.Arrays;

public class testCommandLauncher {

    public static void main(String[] args) throws Exception
    {
        System.out.println(Arrays.toString(OsrsApi.Hiscores.Skills.getAllLevels("Stan xD", false, false, false)));
    }
}
