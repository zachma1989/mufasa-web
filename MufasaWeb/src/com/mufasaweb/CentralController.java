package com.mufasaweb;

import java.util.List;

import org.mufasamedia.recommendercore.Engine;

public class CentralController {
 	public static List<String> getRecommendations(String userId) {
 		int intUserId = Integer.parseInt(userId);
 		
 		return Engine.getRecommendationList(intUserId);
 		
 		
 		
 	}

}
