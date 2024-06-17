package com.example.devbitjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.model.Root;

@RestController
public class FreeTestCon {

	int i = 0;
	
	//pn can be 1,2,3 ??

	@GetMapping("freerest/{pn}")
	public List<Photo> listRest(@PathVariable("pn") int pn) {
		
		if(pn==0) {
			return List.of();//empty list
		}
		
		System.out.println("req###" + pn);

		System.out.println("req" + i++);
		
		List<String> urls= Arrays.asList(
				
				
				
				"https://drive.google.com/file/d/1PIp9zSuNPdNk6jQJ4E6e8jwFtNjqUwnd/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WR_SQSbEi994N3Ib4wvAesdwB6EBDSyO/view?usp=drivesdk",
				"https://drive.google.com/file/d/1x3aEQaxDvCCiP26BLBH1lVYDtiSZeEjk/view?usp=drivesdk",
				"https://drive.google.com/file/d/10OB7VxHYE-M3L_dJ67y9n9ym-QxhCLG2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1UMp5j0t9pn7oVG9MX9a82ZGqJ3_XK7qG/view?usp=drivesdk",
				"https://drive.google.com/file/d/1anF1FCb20S0HqiqT1UhPCD_V4XASx_Qy/view?usp=drivesdk",
				
				
				"https://drive.google.com/file/d/1OdZdOPIs9ULSQLLC3ic3-Eb0qakV9s-1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qJB0wbwmzLjUGPaedP8zDsq6pDh3ENtN/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nhj4zfHVwd4FoRTlClEqT90yT5h4K23m/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/1VeioZa8zKb_2bmSFDjyiLdNBV78BQB9C/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XClMYBT9gFMMXHUEeWsVb5o-Nb9hKpdx/view?usp=drivesdk",
				"https://drive.google.com/file/d/1X62roiHPvqMLgTbQ9R_t-zmrtseyZAhK/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zyCzx-eYq4WlytYMU-9vTb0HVWNgRUTr/view?usp=drivesdk",
				"https://drive.google.com/file/d/1d3Bzsy2j1BNZYUy_1r9eUO7KT5iaH47P/view?usp=drivesdk",
				"https://drive.google.com/file/d/1NarWKqC2XCUN9NsYh8ScZ9aACZT9iSML/view?usp=drivesdk",
				"https://drive.google.com/file/d/1v3d5P3_s0iJTTet9Y6ULQwn13oW5XOCY/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/149SwUqq3o_Vh7sNlbDQ0TWFA7IONvSrT/view?usp=drive_link",
				
				"https://drive.google.com/file/d/1mwFsZFeridcH5MekuQObXN1EB5aIv69u/view?usp=drivesdk",
				"https://drive.google.com/file/d/1GG4NGX7vJCRMZ3o40sDS6JuobwIY-p5q/view?usp=drivesdk",
				"https://drive.google.com/file/d/1yy6NrgpziSMkFSV6_ru0dxvj_znWz8dq/view?usp=drivesdk",
				"https://drive.google.com/file/d/15lv0-lIzT0N8F560dYXh3I7kDi8OUPOL/view?usp=drivesdk",
				"https://drive.google.com/file/d/1N8ImFuV28N2brcHYTXly0i2zyeRZBmi-/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/1Kt-Un53274hKCvb7U_xeN_GOc6PGdQc6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1OafQumSW9S1OJBH7j6tsDoG9ChnNPBmj/view?usp=drivesdk",
				"https://drive.google.com/file/d/1YzW-v6ABytt5MvdCtVVqYKxA9hfGwzr1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1oQ-xoLdejTJglVobvD927DpRH3VN55Pu/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/1NLVm_0E1X1da7Pz7pfYZYpiKR69YU_ZE/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ppktCR_40PxQ1Ym1-ES4khDSGIYQW8K1/view?usp=drivesdk",
				"https://drive.google.com/file/d/15OW5c_o15HpjTcp5MVIDQtnWrqA1Da1P/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Fw-b3yhBT1DwR8fCb4eH033H4fxKK6y8/view?usp=drivesdk",
				"https://drive.google.com/file/d/1y7GsGXMASncvmsoCIJcAxcqKuJOgy1FP/view?usp=drivesdk",
				"https://drive.google.com/file/d/195wwOEVp1pQEUKmmkB5Jodhgq8xHC3_w/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QukDv0rHp0jMc8SSJw381y6lEENm0yJ9/view?usp=drivesdk",
				
				
				"https://drive.google.com/file/d/1Kt-Un53274hKCvb7U_xeN_GOc6PGdQc6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1OafQumSW9S1OJBH7j6tsDoG9ChnNPBmj/view?usp=drivesdk",
				"https://drive.google.com/file/d/1YzW-v6ABytt5MvdCtVVqYKxA9hfGwzr1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1oQ-xoLdejTJglVobvD927DpRH3VN55Pu/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/1DDxPats4lK4poaiK495RILjzOxr4u7Ew/view?usp=drivesdk",
				
				"https://drive.google.com/file/d/17nXxjx6-ixUfvbLtWHky4BaJLeF9DzA4/view?usp=drivesdk",
				"https://drive.google.com/file/d/1aQwG-eCYM6MMQ46pvtTANF99GFULvT_x/view?usp=drivesdk",
				
				
				"https://drive.google.com/file/d/1Qa8RF1bRh1FqfWq0zcvcn6Y5u4vQks4y/view?usp=drivesdk",
				"https://drive.google.com/file/d/1N8ImFuV28N2brcHYTXly0i2zyeRZBmi-/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BUWa1rcb1_79fCf_AK22ZUO8z0eY599u/view?usp=drivesdk",
				"https://drive.google.com/file/d/14Ww3kpsy_3cRBq76YNxvWqkphWimZDe-/view?usp=drivesdk"
				
				
				
			);
		//fix with 5 ,images issue there, No image left, on client
		
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
			return pList;
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
