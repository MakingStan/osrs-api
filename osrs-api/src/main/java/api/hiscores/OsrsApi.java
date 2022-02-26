package api.hiscores;

import org.json.JSONException;
import org.json.JSONObject;
import org.makingstan.Parser;
import org.makingstan.Reader;

import java.io.IOException;
import java.util.HashMap;

public class OsrsApi {
    public static class Hiscores {

        public Hiscores() throws IOException {
        }

        public static class Skills {

            /*the requests will still work for hardcore, normal, and ultimate ironmans even if you don't say they are one. but the rank will be differen because it's looked up on the overall highscore*/
            public static long getOverallLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("OverAllLevel")));
            }

            public static long getOverallRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("OverAllRank")));
            }

            public static long getOverallXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("OverAllXp")));
            }


            public static long getAttackLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AttackLevel")));
            }

            public static long getAttackRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AttackRank")));
            }

            public static long getAttackXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AttackXp")));
            }

            public static long getDefenceLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("DefenceLevel")));
            }

            public static long getDefenceRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("DefenceRank")));
            }

            public static long getDefenceXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("DefenceXp")));
            }

            public static long getStrengthLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("StrengthLevel")));
            }

            public static long getStrengthRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("StrengthRank")));
            }

            public static long getStrengthXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("StrengthXp")));
            }

            public static long getHitpointsLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HitpointsLevel")));
            }

            public static long getHitpointsRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HitpointsRank")));
            }

            public static long getHitpointsXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HitpointsXp")));
            }

            public static long getRangedLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RangedLevel")));
            }

            public static long getRangedRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RangedRank")));
            }

            public static long getRangedXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RangedXp")));
            }

            public static long getPrayerLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("PrayerLevel")));
            }

            public static long getPrayerRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("PrayerRank")));
            }

            public static long getPrayerXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("PrayerXp")));
            }

            public static long getMagicLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MagicLevel")));
            }

            public static long getMagicRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MagicRank")));
            }

            public static long getMagicXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MagicXp")));
            }

            public static long getCookingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CookingLevel")));
            }

            public static long getCookingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CookingRank")));
            }

            public static long getCookingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CookingXp")));
            }


            public static long getWoodcuttingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("WoodcuttingLevel")));
            }

            public static long getWoodcuttingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("WoodcuttingRank")));
            }

            public static long getWoodcuttingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("WoodcuttingXp")));
            }

            public static long getFletchingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FletchingLevel")));
            }

            public static long getFletchingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FletchingRank")));
            }

            public static long getFletchingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FletchingXp")));
            }

            public static long getFishingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FishingLevel")));
            }

            public static long getFishingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FishingRank")));
            }

            public static long getFishingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FishingXp")));
            }

            public static long getFiremakingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FiremakingLevel")));
            }

            public static long getFiremakingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FiremakingRank")));
            }

            public static long getFiremakingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FiremakingXp")));
            }

            public static long getCraftingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CraftingLevel")));
            }

            public static long getCraftingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CraftingRank")));
            }

            public static long getCraftingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("CraftingXp")));
            }

            public static long getSmithingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("Smithinglevel")));
            }

            public static long getSmithingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("SmithingRank")));
            }

            public static long getSmithingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("SmithingXp")));
            }

            public static long getMiningLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MiningLevel")));
            }

            public static long getMiningRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MiningRank")));
            }

            public static long getMiningXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("MiningXp")));
            }

            public static long getHerbloreLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HerbloreLevel")));
            }

            public static long getHerbloreRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HerbloreRank")));
            }

            public static long getHerbloreXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HerbloreXp")));
            }

            public static long getAgilityLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AgilityLevel")));
            }

            public static long getAgilityRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AgilityRank")));
            }

            public static long getAgilityXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("AgilityXp")));
            }

            public static long getThievingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ThievingLevel")));
            }

            public static long getThievingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ThievingRank")));
            }

            public static long getThievingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ThievingXp")));
            }

            public static long getSlayerLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("SlayerLevel")));
            }

            public static long getSlayerRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("SlayerRank")));
            }

            public static long getSlayerXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("SlayerXp")));
            }

            public static long getFarmingLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FarmingLevel")));
            }

            public static long getFarmingRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FarmingRank")));
            }

            public static long getFarmingXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("FarmingXp")));
            }

            public static long getRunecraftLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RunecraftLevel")));
            }

            public static long getRunecraftRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RunecraftRank")));
            }

            public static long getRunecraftXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("RunecraftXp")));
            }

            public static long getHunterLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HunterLevel")));
            }

            public static long getHunterRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HunterRank")));
            }

            public static long getHunterXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("HunterXp")));
            }

            public static long getConstructionLevel(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ConstructionLevel")));
            }

            public static long getConstructionRank(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ConstructionRank")));
            }

            public static long getConstructionXp(String playerName, boolean isIronman, boolean isHardcoreIronman, boolean isUltimateIronman) throws IOException
            {
                String rawHiscoresData = Reader.getRawPlayerHiscoresData(playerName, isIronman, isHardcoreIronman, isUltimateIronman);
                HashMap skillsHiscoreData = Parser.parseRawSkillHiscoreData(rawHiscoresData);


                return Long.parseLong(String.valueOf(skillsHiscoreData.get("ConstructionXp")));
            }
        }

    }

    public static class Ge {

        public static int getItemPrice(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return Integer.parseInt(rawGeItemDataJson.getJSONObject("item").getJSONObject("current").getString("price"));
        }

        public static String getItem(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getString("item");
        }

        public static String getItemName(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("name");
        }

        public static String getItemIconUrl(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("icon");
        }

        public static String getItemIconLargeUrl(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("icon_large");
        }

        public static String getItemTypeUrl(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("type");
        }

        public static String getItemTypeIconUrl(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("typeIcon");
        }

        public static boolean isMembersItem(int itemId) throws IOException, JSONException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            if (rawGeItemDataJson.getJSONObject("item").getString("members").equalsIgnoreCase("false")) {
                return false;
            }
            return true;
        }

        public static String getItemDescription(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("description");
        }


        public static String getCurrent(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("current");
        }


        public static String getToday(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("today");
        }


        public static String getDay30(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("day30");
        }

        public static String getDay90(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("day90");
        }

        public static String getDay180(int itemId) throws JSONException, IOException {
            String rawGeItemData = Reader.getRawGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("item").getString("day180");
        }


    }

    public static class RealTimePrices {

        public static String getHighPrice(int itemId) throws Exception {
            String rawGeItemData = Reader.getRawRealTimeGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("data").getJSONObject(""+itemId).getString("high");
        }

        public static String getHighTimePrice(int itemId) throws Exception {
            String rawGeItemData = Reader.getRawRealTimeGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("data").getJSONObject(""+itemId).getString("highTime");
        }

        public static String getlowPrice(int itemId) throws Exception {
            String rawGeItemData = Reader.getRawRealTimeGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("data").getJSONObject(""+itemId).getString("low");
        }

        public static String getLowTimePrice(int itemId) throws Exception {
            String rawGeItemData = Reader.getRawRealTimeGeData(itemId);
            JSONObject rawGeItemDataJson = new JSONObject(rawGeItemData);

            return rawGeItemDataJson.getJSONObject("data").getJSONObject(""+itemId).getString("lowTime");
        }
    }
}
