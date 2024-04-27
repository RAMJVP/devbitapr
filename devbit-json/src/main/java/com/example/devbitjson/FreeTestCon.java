package com.example.devbitjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.model.Root;

@RestController
public class FreeTestCon {

	int i = 0;

	@GetMapping("freerest/{pn}")
	public List<Photo> listRest(@PathVariable("pn") int pn) {
		System.out.println("req###" + pn);

		System.out.println("req" + i++);
		
		List<String> urls= Arrays.asList(
				
				
				
				
				"https://drive.google.com/file/d/1mwFsZFeridcH5MekuQObXN1EB5aIv69u/view?usp=drivesdk",
				"https://drive.google.com/file/d/1GG4NGX7vJCRMZ3o40sDS6JuobwIY-p5q/view?usp=drivesdk",
				"https://drive.google.com/file/d/1yy6NrgpziSMkFSV6_ru0dxvj_znWz8dq/view?usp=drivesdk",
				"https://drive.google.com/file/d/15lv0-lIzT0N8F560dYXh3I7kDi8OUPOL/view?usp=drivesdk",
				"https://drive.google.com/file/d/1N8ImFuV28N2brcHYTXly0i2zyeRZBmi-/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BUWa1rcb1_79fCf_AK22ZUO8z0eY599u/view?usp=drivesdk",
				"https://drive.google.com/file/d/14Ww3kpsy_3cRBq76YNxvWqkphWimZDe-/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Agoxklr7EjdBlGxbAmyq29Vwroithj6Y/view?usp=drivesdk",
				"https://drive.google.com/file/d/1T56P0C1YJ92Uez32bWw8sw0oOodZ7j_b/view?usp=drivesdk",
				"https://drive.google.com/file/d/14j9hLtKfwnc-h-57j0m5yXYZxga2Zu3A/view?usp=drivesdk",
				"https://drive.google.com/file/d/1bM84zxL3b5LLepr6LyFLRoYaviKUafXF/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WQD3dE-8CmB_bCVfwmipIIciBlv0lWeY/view?usp=drivesdk",
				"https://drive.google.com/file/d/13DCUDHTYqb92Il4VKCujozFdOohRn-qY/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Kt-Un53274hKCvb7U_xeN_GOc6PGdQc6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1OafQumSW9S1OJBH7j6tsDoG9ChnNPBmj/view?usp=drivesdk",
				"https://drive.google.com/file/d/1YzW-v6ABytt5MvdCtVVqYKxA9hfGwzr1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1oQ-xoLdejTJglVobvD927DpRH3VN55Pu/view?usp=drivesdk",
				"https://drive.google.com/file/d/1sZiYb5_6LwMGImdtNSqUhuiqSSJuQf_w/view?usp=drivesdk",
				"https://drive.google.com/file/d/1UaC0Q7usa8TGet9fIhJ2rTu5O4w04xLP/view?usp=drivesdk",
				"https://drive.google.com/file/d/1y5qu9vwryToPorX9sxqDqAs5o2B1_K5X/view?usp=drivesdk",
				"https://drive.google.com/file/d/1xuElrbrJLhMK0c14XkuOb_M84MY4vORc/view?usp=drivesdk",
				"https://drive.google.com/file/d/1wlOASkxyCOak4TY1XsrDxI5-IRatyU9p/view?usp=drivesdk",
				"https://drive.google.com/file/d/1uJlqIJPuBZs5ZS4Z80pMBZ4wNRX8UWMC/view?usp=drivesdk",
				"https://drive.google.com/file/d/1KqzbZFCwU1t6ZhYE_Lc8dzIuj3txEnJf/view?usp=drivesdk",
				"https://drive.google.com/file/d/1V5P3rZYf-JRVnQS2kBA6stSKjyG7uZiD/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Z5cWrMQD61PB-F_PpNDxDE-Iv2U5Jsiz/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_DgW0RP82p-UiCLqw8JLEniSKyHmuLOy/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XF3X1dofiDvQlMf3VyFFKWlKndgc0e9B/view?usp=drivesdk",
				"https://drive.google.com/file/d/10M3eKhi-LZvRR6POhYiUZOsCkvOXMkhQ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1i8Qv5qbWxTLStmJ5sE3hcBIXzspfimvB/view?usp=drivesdk",
				"https://drive.google.com/file/d/1xLQjcw_r7wHNNWsEadbsZt1AXlzszKet/view?usp=drivesdk",
				"https://drive.google.com/file/d/12xfbhbV3L60UYBXyXkkxLcmvkTDHKELq/view?usp=drivesdk",
				"https://drive.google.com/file/d/1vp6VCJ867iUHqpiBOC0-OA3F0W8qoSVz/view?usp=drivesdk",
				"https://drive.google.com/file/d/15QLh5aAfEBoN4XJhziOpamFCqGmj8P6s/view?usp=drivesdk",
				"https://drive.google.com/file/d/13aFTqe_AhPmyuTtAnFPh2yyzNfwD_smp/view?usp=drivesdk",
				"https://drive.google.com/file/d/13APo4k7GzhobbTqftvOT0TM1cNxA1E1Y/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nvBTxXZ8vfgQ-ogLXJ46wM05alASCl9O/view?usp=drivesdk",
				"https://drive.google.com/file/d/12pSlqN2jQHUoCUzQ2Yj1tTkrp9WfexLT/view?usp=drivesdk",
				"https://drive.google.com/file/d/1MmL976M8VJJRTbuQRjbIC1nkKrej64PW/view?usp=drivesdk"
				
				
				
			);
		
		
				/*
				 * "https://drive.google.com/uc?export=view&id=1y6UxV-quYC_gIpqjPwGvKR5gShcT1ZbK",
				 * "https://drive.google.com/uc?export=view&id=1f1sHjZMdrBlAXR3XDAoEStJ-qNRj25sM",
				 * "https://drive.google.com/uc?export=view&id=14GGY17j6Q2_NOo8zIqO0FdloIER3ULir",
				 */
		
	
		
		List<Photo> pList=IntStream.range(0, urls.size()).collect(()->new ArrayList<Photo>(), (list,i)->{
			Photo p4=new Photo();
			p4.setId(i);
			p4.setUrl(urls.get(i));
			list.add(p4);
			
		},(l1,l2)->l1.addAll(l2));
		
		
		
		
		
	//	int pn=3;
		
		int start=(pn-1)*12;
		
		
		int end=pn*12;
		
		
		if(start>pList.size()) {
			System.err.println("No image left");
			start=pList.size();
		}
		if(end>pList.size()) {
			end=pList.size();
		}
		
		return pList.subList(start, end);
	
	}
	
	
	
	
	@GetMapping("delete/{emailid}")
	public boolean delete(@PathVariable("emailid") int emailId) {
		
		System.out.println("Request received for delete " + emailId);
		return true; 
	}

	
	
	
	

	@GetMapping("listImg")
	public List<Photo> listImg() {

		System.out.println("req" + i++);

		List<Photo> pList = new ArrayList<Photo>();

		Photo p = new Photo();
		p.setId(0);
		p.setUrl("https://drive.google.com/uc?export=view&id=1y6UxV-quYC_gIpqjPwGvKR5gShcT1ZbK");
		Photo p1 = new Photo();
		p1.setId(1);
		p1.setUrl("https://drive.google.com/uc?export=view&id=1f1sHjZMdrBlAXR3XDAoEStJ-qNRj25sM");

		Photo p2 = new Photo();
		p2.setId(2);
		p2.setUrl("https://drive.google.com/uc?export=view&id=14GGY17j6Q2_NOo8zIqO0FdloIER3ULir");

		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		return pList;

	}

	@Autowired
	private Serv serv;

	@GetMapping("gdrive/images")
	public List<Photo> imagesGdrive() {
		return serv.getAllProducts();
	}

	@GetMapping("gdrive1/images")
	public List<Root> imagesGdrive1() {
		return serv.getProducts();
	}
	
	
	
	

}
