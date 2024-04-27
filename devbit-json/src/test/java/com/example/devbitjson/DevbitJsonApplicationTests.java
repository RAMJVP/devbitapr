package com.example.devbitjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevbitJsonApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	
	
	
	@Test
	public void testList() {
		List<String> urls= Arrays.asList(
				
				
				
				"https://drive.google.com/file/d/1enx-FGJzk8aBj791tp5RwXYQsMlEEZZv/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nWpeZHwOunuvidA8EQVJZPvH_NVZoFcJ/view?usp=drivesdk",
				"https://drive.google.com/file/d/18yPasny_61qQ60ncw2NqA8l0ylvcCG2_/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QrBLBXbehSCLAXEp4XcOEHamnB-N1vMe/view?usp=drivesdk",
				"https://drive.google.com/file/d/1hYZIsRu0oiCapVAK9J4flLSfYQtWEANT/view?usp=drivesdk",
				"https://drive.google.com/file/d/1-NEdL64SN-eQFlVOQu7VbWySXIWDvWHY/view?usp=drivesdk",
				"https://drive.google.com/file/d/18rlWlq3l7AWrkjZ-PslaVG23O0tDItlB/view?usp=drivesdk",
				"https://drive.google.com/file/d/1RyzKPvskzubX8D33jxiULN-c9S2Gc5qq/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zRwfWWZy69dxR3sFbWDv_YamEgwfp300/view?usp=drivesdk",
				"https://drive.google.com/file/d/1FR21ZhbT7XFyE0602noXcHMh59WG4Gwg/view?usp=drivesdk",
				"https://drive.google.com/file/d/14J57nRsDuUyyJZoE1TjoRMejAvcVDmiF/view?usp=drivesdk",
				"https://drive.google.com/file/d/1hdMIZCAzwS4h1AU2pIjcCkOZmQMAppaz/view?usp=drivesdk",
				"https://drive.google.com/file/d/1RCd7y-GxfBx4nHnXmT5Elvz4bkbpOEfN/view?usp=drivesdk",
				"https://drive.google.com/file/d/1jGDtmSUwBTe2xYJtrydA6SNq9N3B64LQ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1NXmAL9ay_4TMuFWG06IqRKXY5vVVt7w_/view?usp=drivesdk",
				"https://drive.google.com/file/d/1lFZbBZLf54QkfEBbaGOcejMB-WaPIrFx/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QXuTYklr9Cwyguki47RQkSEGCYwwF3eQ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1cO3LQIzsPDWeLAT1AdcC497FhaO1EbZ-/view?usp=drivesdk",
				"https://drive.google.com/file/d/19gGpPH2uffO6G0GjwUW4T0F6nfTSnap5/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XGRWZEmO9Caq3XjHDPsR0iflVtumIGTA/view?usp=drivesdk",
				"https://drive.google.com/file/d/19eQ376fDbQyTbt_QcE3Lxbau0F3t8IR3/view?usp=drivesdk",
				"https://drive.google.com/file/d/1SShhoNAm0mU72j68o5hBvjMoMyDi4GdT/view?usp=drivesdk",
				"https://drive.google.com/file/d/1dH2If6TDRRJOTKDROhShYezPalxuaH_e/view?usp=drivesdk",
				"https://drive.google.com/file/d/1o7JR27VGc4wcT18h4AktWpAR0Iyuv4bh/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nouYeKZ50UYv77hchorm3pJlZkyYMetM/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DZi-O3qdV_kcp1tV3RqBJuoJSucc4i9e/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zWqlmsmnXOFwf9HYL76z_Y6gVH8UVGbC/view?usp=drivesdk",
				"https://drive.google.com/file/d/19xja0lAfbuy7XyECLwgioWf3yLvSVMEv/view?usp=drivesdk",
				"https://drive.google.com/file/d/1HmVILD5Z-By2DVF-sIbcN77-uks5eAex/view?usp=drivesdk",
				"https://drive.google.com/file/d/1CuLS5S68lR1Z_ZmS7IhQhaW6ruX7dDkK/view?usp=drivesdk",
				"https://drive.google.com/file/d/18TmzMNZxi8ugtpVxiUdnxC-KuSYBUsd1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1mPaj-S0jFlr_bOBSDj52B27skX4Dp1Lo/view?usp=drivesdk",
				"https://drive.google.com/file/d/1xkp5nEqkuzWQbhTbsWiIrdSJ4xQOVECu/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LX10yrdC3hu-j_4jZJy2KdoE2zA9O0bX/view?usp=drivesdk",
				"https://drive.google.com/file/d/1wUniC1bvmnFTAnkv4_qTkehHO7WBCkaH/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DJOFPVSm7d1B0PxVPb-LyyXehVc2qe-g/view?usp=drivesdk",
				"https://drive.google.com/file/d/1hEN0j45mqHpFDHtmbS-4QfGpujBNab8b/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_bIyKP6hI41TvbUU4YJrFt4TfduqSfFv/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QqBhihbrrSo6Jd9eOqDpX_801QXCqCfr/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ont2BcdtVV121wMgrXTuxxGmOBPoWXE8/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Jgp5A1qRM0kxOZfv5ZeImNL2EFe-BBGy/view?usp=drivesdk",
				"https://drive.google.com/file/d/1idG3zyvQkyOG-_hkqqPs2U1JXum5Y13_/view?usp=drivesdk",
				"https://drive.google.com/file/d/12NtE1YzjXIJE21bwrK-jyyrjjjqYc6sP/view?usp=drivesdk",
				"https://drive.google.com/file/d/1-ff-9zROUrp18CmhWrsglDNEdmKLcHFP/view?usp=drivesdk",
				"https://drive.google.com/file/d/1TECFhke5AJ0UT0lxBqsLSCVG5eAPzmzg/view?usp=drivesdk",
				"https://drive.google.com/file/d/1swXPkbklPki_CSG9wWRG9OQaEu9XDhXq/view?usp=drivesdk",
				"https://drive.google.com/file/d/1jgR-Y-KfPVg-mpDaf1A0V4Yq-VuUYFCH/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_66yQzlDhmE31W2yDYolkEEsUkz9xjw-/view?usp=drivesdk",
				"https://drive.google.com/file/d/13PUq7HL2WW5f1_3GJ_T0AErI0CXPOMfq/view?usp=drivesdk",
				"https://drive.google.com/file/d/1N6wvlUjbh6GxA1ZEvGVPin2CujWU0uH2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1OE-c1XQY-chSwAf0YbVynVwse7gGGzWh/view?usp=drivesdk",
				"https://drive.google.com/file/d/1kRGlGZxI5-loBdQS8UREyGOoKHKIzB9c/view?usp=drivesdk",
				"https://drive.google.com/file/d/1rSK9SCjTs7Z01I_33AvGeG_UGxopCLDZ/view?usp=drivesdk",
				"https://drive.google.com/file/d/11OIPPf5ZMsRRskIgflldtocJnMH6Dv80/view?usp=drivesdk",
				"https://drive.google.com/file/d/1RNoBTP1pAiP2BQN8dZ-B0p3OVQxr6seN/view?usp=drivesdk",
				"https://drive.google.com/file/d/19FDR5TbarjsBh-e6-2qnN6Pw7EORN9sc/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XhKwZxzBrmy7AiOTB_CarI7M7yxDahL0/view?usp=drivesdk",
				"https://drive.google.com/file/d/1gXMoEdky7BE9V5qvxS6lck0m3vXht0bn/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nMjxYbNtg46zNOTeNNYhhJZfFTUWr4ad/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ojySNt8qEvts-s3GFv-LVIdKgqHgr-FY/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DXS-eUB42DrwTh4eg_jaLrrYg-Q8daBL/view?usp=drivesdk",
				"https://drive.google.com/file/d/1u-PeZLHZQzxnlSs2gbWHyYkwTJHEAbeZ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_-sEJP2HxUs15NGCqWJ2nApQCJmwNoyS/view?usp=drivesdk",
				"https://drive.google.com/file/d/16ZGxs0IcQgONONxIFeAgce80WOt7HoW2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1c5ttyuWsNlTdAD21PcJ634pXlHXCjcU7/view?usp=drivesdk",
				"https://drive.google.com/file/d/1EJWVJFJhzpJ644C9zOdyP37ResdFcKlQ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_ASMAdTFx_WzAysoewMKU5Z33IHtAHVD/view?usp=drivesdk",
				"https://drive.google.com/file/d/1SW4V21tEnH11dYxhvKNWTXDOBu_8uAgd/view?usp=drivesdk",
				"https://drive.google.com/file/d/1xggEY7eSPqbDZ05Ut98A4nP5c3UiRQ4U/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BUpDYuICTgKmA7gbIW3I8GfZykcdomvV/view?usp=drivesdk",
				"https://drive.google.com/file/d/1rBrSmoeyKawscfR2JP_8c-G6CtTRS7EK/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ONz4LiFrY0VJIs5MMsqmsBIqG166_EGh/view?usp=drivesdk",
				"https://drive.google.com/file/d/12zIcrlCgx0aKOrl_vOJursSdahH7Gc6y/view?usp=drivesdk",
				"https://drive.google.com/file/d/1JPf4Pb4CuyP1a39iASXDJFJ9ZaaL-4ss/view?usp=drivesdk",
				"https://drive.google.com/file/d/1FaN7Fp9F_YSkH6lceALSewMsCuZVahJ4/view?usp=drivesdk",
				"https://drive.google.com/file/d/1vp6VCJ867iUHqpiBOC0-OA3F0W8qoSVz/view?usp=drivesdk",
				"https://drive.google.com/file/d/15QLh5aAfEBoN4XJhziOpamFCqGmj8P6s/view?usp=drivesdk",
				"https://drive.google.com/file/d/13aFTqe_AhPmyuTtAnFPh2yyzNfwD_smp/view?usp=drivesdk",
				"https://drive.google.com/file/d/13APo4k7GzhobbTqftvOT0TM1cNxA1E1Y/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nvBTxXZ8vfgQ-ogLXJ46wM05alASCl9O/view?usp=drivesdk",
				"https://drive.google.com/file/d/12pSlqN2jQHUoCUzQ2Yj1tTkrp9WfexLT/view?usp=drivesdk",
				"https://drive.google.com/file/d/1MmL976M8VJJRTbuQRjbIC1nkKrej64PW/view?usp=drivesdk"
				
				
				
				
				
				
				);
		
		
		/*
		 * List<Photo> pList=urls.stream().collect(Collectors.mapping(url->{Photo p4=new
		 * Photo(); int i=0; p4.setId(i++); p4.setUrl(url); return p4; },
		 * Collectors.toList()));
		 */
		
		List<Photo> pList=IntStream.range(0, urls.size()).collect(()->new ArrayList<Photo>(), (list,i)->{
			Photo p4=new Photo();
			p4.setId(i);
			p4.setUrl(urls.get(i));
			list.add(p4);
			
		},(l1,l2)->l1.addAll(l2));
		
		
		
		
		
		int pn=3;
		
		int start=(pn-1)*12;
		
		
		int end=pn*12;
		
		if(end>pList.size()) {
			end=pList.size();
		}
		
		System.out.println("pn"+pn +":::"+pList.subList(start, end)+":::size:"+":::"+pList.subList(start, end).size());
		
		
		
		System.out.println("pList"+pList.size());
		
	}
	
	
	
	
	
	
	
	@Test
	public void swipe() {

		
		
		
		
		
		
	}
	
	
	
	 volatile boolean stop=false;
	
	@Test
	public void flip() {
	
	Thread bkT=new Thread(()->{
		while (!stop()) {
		System.out.println("runing...");}
		
	});
	
	bkT.start();
	
	stop=true;
	System.out.println("@@@");
	}





	private boolean stop() {
		// TODO Auto-generated method stub
		return stop;
	}
	
	
	
	@Test
	public void testRecord(){
		
		
		Person person = new Person("John Doe", 30);
        
        // Accessing the properties of the record
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Declare List<String>, assign 10 random numeric string of 2 digit, like
	 * "12","21","32", "44" ... Using Streams(java 8), group the elements which are
	 * having same sum of digits.
	 * 
	 * Example : "12", "21", "32", "44", "55", "23","66","19","98","85"
	 * 
	 * Output:
	 * 
	 * "12", "21" - sum of digit is 3 "32", "23" - sum of digit is 5 "55","19" - sum
	 * of digit is 10
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
