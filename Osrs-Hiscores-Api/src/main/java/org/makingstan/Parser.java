package org.makingstan;

import java.util.HashMap;

public class Parser {

    public static HashMap parseRawSkillHiscoreData(String rawHiscoreData)
    {
        String skillsHiscoreData;
        String[] hiscoreData;
        HashMap<String, Long> parsedHiscoreData = new HashMap();

        skillsHiscoreData = removeUnnecessaryData(rawHiscoreData);
        hiscoreData = getHiscoreDataInformation(skillsHiscoreData);


        //put everything in our hashmap so we can easily acess it
        parsedHiscoreData.put("OverAllRank", Long.parseLong(hiscoreData[0]));
        parsedHiscoreData.put("OverAllLevel", Long.parseLong(hiscoreData[1]));
        parsedHiscoreData.put("OverAllXp", getRankOrXp(2, 0, hiscoreData));

        parsedHiscoreData.put("AttackRank", getRankOrXp(2, 1, hiscoreData));
        parsedHiscoreData.put("AttackLevel", Long.parseLong(hiscoreData[3]));
        parsedHiscoreData.put("AttackXp", getRankOrXp(4, 0, hiscoreData));

        parsedHiscoreData.put("DefenceRank", getRankOrXp(4, 1, hiscoreData));
        parsedHiscoreData.put("DefenceLevel", Long.parseLong(hiscoreData[5]));
        parsedHiscoreData.put("DefenceXp", getRankOrXp(6, 0, hiscoreData));

        parsedHiscoreData.put("StrengthRank", getRankOrXp(6, 1, hiscoreData));
        parsedHiscoreData.put("StrengthLevel", Long.parseLong(hiscoreData[7]));
        parsedHiscoreData.put("StrengthXp", getRankOrXp(8, 0, hiscoreData));

        parsedHiscoreData.put("HitpointsRank", getRankOrXp(8, 1, hiscoreData));
        parsedHiscoreData.put("HitpointsLevel", Long.parseLong(hiscoreData[9]));
        parsedHiscoreData.put("HitpointsXp",getRankOrXp(10, 0, hiscoreData));

        parsedHiscoreData.put("RangedRank", getRankOrXp(10, 1, hiscoreData));
        parsedHiscoreData.put("RangedLevel", Long.parseLong(hiscoreData[11]));
        parsedHiscoreData.put("RangedXp", getRankOrXp(12, 0, hiscoreData));

        parsedHiscoreData.put("PrayerRank", getRankOrXp(12, 1, hiscoreData));
        parsedHiscoreData.put("PrayerLevel", Long.parseLong(hiscoreData[13]));
        parsedHiscoreData.put("PrayerXp", getRankOrXp(14, 0, hiscoreData));

        parsedHiscoreData.put("MagicRank", getRankOrXp(14, 1, hiscoreData));
        parsedHiscoreData.put("MagicLevel", Long.parseLong(hiscoreData[15]));
        parsedHiscoreData.put("MagicXp", getRankOrXp(16, 0, hiscoreData));

        parsedHiscoreData.put("CookingRank", getRankOrXp(16, 1, hiscoreData));
        parsedHiscoreData.put("CookingLevel", Long.parseLong(hiscoreData[17]));
        parsedHiscoreData.put("CookingXp", getRankOrXp(18, 0, hiscoreData));

        parsedHiscoreData.put("WoodcuttingRank", getRankOrXp(18, 1, hiscoreData));
        parsedHiscoreData.put("WoodcuttingLevel", Long.parseLong(hiscoreData[19]));
        parsedHiscoreData.put("WoodcuttingXp", getRankOrXp(20, 0, hiscoreData));

        parsedHiscoreData.put("FletchingRank", getRankOrXp(20, 1, hiscoreData));
        parsedHiscoreData.put("FletchingLevel", Long.parseLong(hiscoreData[21]));
        parsedHiscoreData.put("FletchingXp", getRankOrXp(22, 0, hiscoreData));

        parsedHiscoreData.put("FishingRank", getRankOrXp(22, 1, hiscoreData));
        parsedHiscoreData.put("FishingLevel", Long.parseLong(hiscoreData[23]));
        parsedHiscoreData.put("FishingXp", getRankOrXp(24, 0, hiscoreData));

        parsedHiscoreData.put("FiremakingRank", getRankOrXp(24, 1, hiscoreData));
        parsedHiscoreData.put("FiremakingLevel", Long.parseLong(hiscoreData[25]));
        parsedHiscoreData.put("FiremakingXp", getRankOrXp(26, 0, hiscoreData));

        parsedHiscoreData.put("CraftingRank", getRankOrXp(26, 1, hiscoreData));
        parsedHiscoreData.put("CraftingLevel", Long.parseLong(hiscoreData[27]));
        parsedHiscoreData.put("CraftingXp", getRankOrXp(28, 0, hiscoreData));

        parsedHiscoreData.put("SmithingRank", getRankOrXp(28, 1, hiscoreData));
        parsedHiscoreData.put("SmithingLevel", Long.parseLong(hiscoreData[29]));
        parsedHiscoreData.put("SmithingXp", getRankOrXp(30, 0, hiscoreData));

        parsedHiscoreData.put("MiningRank", getRankOrXp(30, 1, hiscoreData));
        parsedHiscoreData.put("MiningLevel", Long.parseLong(hiscoreData[31]));
        parsedHiscoreData.put("MiningXp", getRankOrXp(32, 0, hiscoreData));

        parsedHiscoreData.put("HerbloreRank", getRankOrXp(32, 1, hiscoreData));
        parsedHiscoreData.put("HerbloreLevel", Long.parseLong(hiscoreData[33]));
        parsedHiscoreData.put("HerbloreXp", getRankOrXp(34, 0, hiscoreData));

        parsedHiscoreData.put("AgilityRank", getRankOrXp(34, 1, hiscoreData));
        parsedHiscoreData.put("AgilityLevel", Long.parseLong(hiscoreData[35]));
        parsedHiscoreData.put("AgilityXp", getRankOrXp(36, 0, hiscoreData));

        parsedHiscoreData.put("ThievingRank", getRankOrXp(36, 1, hiscoreData));
        parsedHiscoreData.put("ThievingLevel", Long.parseLong(hiscoreData[37]));
        parsedHiscoreData.put("ThievingXp", getRankOrXp(38, 0, hiscoreData));

        parsedHiscoreData.put("SlayerRank", getRankOrXp(38, 1, hiscoreData));
        parsedHiscoreData.put("SlayerLevel", Long.parseLong(hiscoreData[39]));
        parsedHiscoreData.put("SlayerXp", getRankOrXp(40, 0, hiscoreData));

        parsedHiscoreData.put("FarmingRank", getRankOrXp(40, 1, hiscoreData));
        parsedHiscoreData.put("FarmingLevel", Long.parseLong(hiscoreData[41]));
        parsedHiscoreData.put("FarmingXp", getRankOrXp(42, 0, hiscoreData));

        parsedHiscoreData.put("RunecraftRank", getRankOrXp(42, 1, hiscoreData));
        parsedHiscoreData.put("RunecraftLevel", Long.parseLong(hiscoreData[43]));
        parsedHiscoreData.put("RunecraftXp", getRankOrXp(44, 0, hiscoreData));

        parsedHiscoreData.put("HunterRank", getRankOrXp(44, 1, hiscoreData));
        parsedHiscoreData.put("HunterLevel", Long.parseLong(hiscoreData[45]));
        parsedHiscoreData.put("HunterXp", getRankOrXp(46, 0, hiscoreData));

        parsedHiscoreData.put("ConstructionRank", getRankOrXp(46, 1, hiscoreData));
        parsedHiscoreData.put("ConstructionLevel", Long.parseLong(hiscoreData[47]));
        parsedHiscoreData.put("ConstructionXp", getRankOrXp(48, 0, hiscoreData));

        return parsedHiscoreData;
    }

    private static Long getRankOrXp(int part, int rankOrXp, String[] hiscoreData)
    {
        //get the rank or the xp. they are sepperated by a space that's why we split them with one too. 1 is a rank 0 is xp (or the other way around not sure)
        return Long.parseLong(hiscoreData[part].split(" ")[rankOrXp]);
    }


    private static String removeUnnecessaryData(String rawHiscoreData)
    {
        //remove the rest that is not skills
        return rawHiscoreData.split("-1")[0];
    }

    private static String[] getHiscoreDataInformation(String skillsHiscoreData)
    {
        //split everything with a comma
        return skillsHiscoreData.split(",");
    }


}
