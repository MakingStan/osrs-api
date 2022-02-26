package org.makingstan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Reader {

    private static final String USER_AGENT = "Mozilla/5.0";


    public static String getRawPlayerHiscoresData(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException {
        String link;
        //if it is an ironman we want to lookup with the ironman hiscores and so on..
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

        URL url = new URL(link + playerName);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        //specify we want to use a get request.
        con.setRequestMethod("GET");
        //specify our user agent(in this case mozilla firefox)
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();

        //if the ping was successful (this is what HttpUrlconnection.HTTP_OK does) then we want to get the data.
        if (responseCode == HttpURLConnection.HTTP_OK)
        {
            // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null)
            {
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



    //we get this data from prices.runescape.wiki they collect realtime data from runelite clients. so it's extremely accurate
    public static String getRawRealTimeGeData(int itemId) throws Exception
    {
        return getRawData("https://prices.runescape.wiki/api/v1/osrs/latest?id=", itemId);
    }


    public static String getRawGeData(int itemId) throws IOException
    {
        return getRawData("https://secure.runescape.com/m=itemdb_oldschool/api/catalogue/detail.json?item=", itemId);
    }

    private static String getRawData(String link, int itemId) throws IOException {
        // no need to parse this data because it's already parsed with the json inside.
        URL url = new URL(link + itemId);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        //specify get request
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();

        //if the request is ok then we can retrieve the data
        if (responseCode == HttpURLConnection.HTTP_OK)
        {

            //success the response code is okay
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null)
            {
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