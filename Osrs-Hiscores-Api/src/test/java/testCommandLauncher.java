import api.hiscores.Api;

import java.io.IOException;

public class testCommandLauncher {

    public static void main(String[] args) throws IOException
    {
        System.out.println(Api.Hiscores.Skills.getAgilityLevel("Stan xD", false, false, false));
    }
}
