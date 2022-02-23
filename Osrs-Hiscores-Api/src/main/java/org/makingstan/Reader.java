package org.makingstan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class Reader {

    private static final String USER_AGENT = "Mozilla/5.0";

    static String hardcoreIronDentifier = "_hardcore_ironman";
    static String normalIronDentifier = "_ironman";
    static String ultimateIronDentifier = "_ultimate";


    public static String getRawPlayerHiscoresData(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException {
        String link;
        if(isIronman)
        {
            link = "https://secure.runescape.com/m=hiscore_oldschool_ironman/index_lite.ws?player=";
        }
        else if(isHardcoreIronman)
        {
            link = "https://secure.runescape.com/m=hiscore_oldschool_hardcore_ironman/index_lite.ws?player=";
        }
        else if(isUltimateIronman)
        {
            link = "https://secure.runescape.com/m=hiscore_oldschool_ultimate/index_lite.ws?player=";
        }
        else
        {
            link = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";
        }
        System.out.println(link);
        URL url = new URL(link + playerName);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine+" ");
            }
            in.close();

            String responseString = response.toString();


            return responseString;
        }
        else
        {
            System.out.println("GET request not worked || returned null");
            return null;
        }
    }


    public static String getRawGeData(int itemId) throws IOException
    {
        // no need to parse this data because it's already parsed with the json inside.
        URL url = new URL("https://secure.runescape.com/m=itemdb_oldschool/api/catalogue/detail.json?item=" + itemId);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            //success the response code is okay
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine+" ");
            }
            in.close();

            String responseString = response.toString();


            return responseString;
        }
        else
        {
            System.out.println("GET request not worked || returned null");
            return null;
        }
    }
}

