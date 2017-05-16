package com.michaelfotiadis.steam.provider.image;

import com.michaelfotiadis.steam.provider.base.AssetProvider;

import java.util.Locale;

public class ImageProvider extends AssetProvider {

    private static final String BASE_ENDPOINT = "http://cdn.dota2.com/apps/dota2/images/";

    private static final String ENDPOINT_ITEM = BASE_ENDPOINT + "items/%s_%s";
    private static final String ENDPOINT_HERO = BASE_ENDPOINT + "heroes/%s_%s";

    private static final String PREFIX_ITEM = "item_";
    private static final String PREFIX_HERO = "npc_dota_hero_";


    public String getItemImageEndpoint(final String itemName) {

        if (itemName == null || itemName.length() == 0) {
            return "";
        }

        final String searchName = itemName.startsWith(PREFIX_ITEM) ? itemName.replaceAll(PREFIX_ITEM, "") : itemName;

        return String.format(Locale.US, ENDPOINT_ITEM, searchName.toLowerCase(Locale.US), Size.LARGE_HORIZONTAL.toString());

    }

    public String getHeroImageEndpoint(final String heroName) {

        return this.getHeroImageEndpoint(heroName, Size.LARGE_HORIZONTAL);

    }

    public String getHeroImageEndpoint(final String heroName, final Size size) {

        if (heroName == null || heroName.length() == 0) {
            return "";
        }

        final String searchName = heroName.startsWith(PREFIX_HERO) ? heroName.replaceAll(PREFIX_HERO, "") : heroName;

        return String.format(Locale.US, ENDPOINT_HERO, searchName.toLowerCase(Locale.US), size.toString());

    }


}