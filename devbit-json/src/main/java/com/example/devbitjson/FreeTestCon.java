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
		System.out.println("Request received pn " + pn);
		if(pn==0) {
			return List.of();//empty list
		}
		
		System.out.println("req###" + pn);

		System.out.println("req" + i++);
		
		List<String> urls= Arrays.asList(
				
				
				"https://drive.google.com/file/d/1E_gkyWameXSI3jg8R3Ty9MwwG8BQ0dRj/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1MBmilS1JAqDrNvFZii9r34M3GeqDHYdu/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1_l_gfY9GfP5wcI4tjxqTupCNOp-713eh/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1mFVYSrvL5eRKwHHuFu2uKnW6t7vUqbRS/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1x11fMlDRM0fWFBF0GAZkd3x0lUy_dOs6/view?usp=drivesdk",					
				"https://drive.google.com/file/d/15na5gEjp-cZ4iWHffwySOVB4de4S-NbG/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DlVcp7O-9_kjdFdnpBdqVRn1EUsSi7pC/view?usp=drivesdk",
				"https://drive.google.com/file/d/1AlIpG7pU1ZZUeBBqaE8eNWzlfbGXQ5LA/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qDx3FeyUm7cCQdXFyaDLnWCTC3Q46Agl/view?usp=drivesdk",
				
				
				"https://drive.google.com/file/d/1C74SQVChp9LuHtjZx9vd7IFaslKVWIEr/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1GU3mwIEepCfiqPChhIUHCINevgZzScBc/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1rCejq-rn4-9bQPRsfgWsxkTLsfaXiT4d/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1t2W2SroxZYslg-HUpG-UQWX3p762yXLR/view?usp=drivesdk",					
				
				"https://drive.google.com/file/d/12bRR_9qYZGlzn2BNBNY8Ax8TSgVrtYeg/view?usp=drivesdk",
				"https://drive.google.com/file/d/13bLJKcoK3axsHApdGdiShJ-jqtFZ7c2-/view?usp=drivesdk",
				"https://drive.google.com/file/d/1709x57fEeAgh22iE1lz6hUxeMNqB67U7/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DCeIjgt8LJBx55ISOqPSBsGxlQ9A6OUb/view?usp=drivesdk",
				"https://drive.google.com/file/d/1x9Nndeu4euecxysRfu7J92kT2HUIxpRC/view?usp=drivesdk",
				"https://drive.google.com/file/d/1D7CJ7CCG3_hWuPrie3yZmtG3qLxYfqo6/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1gqRf8pTPDifFADd2ZKAlo_a7d1rycnGN/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1rCrI72NErcoWPpBFSzs8fCLq_dzlgcGO/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1vb7x3l-gFJMltPc_7MYZjfyyQbJk2lCA/view?usp=drivesdk",					
				"https://drive.google.com/file/d/1wLYfJvWWwZkjvG61a37lbJbTjsyVTGU7/view?usp=drivesdk",					
				
				
				"https://drive.google.com/file/d/1FdJdUpaRxZZzew-Aq6esVyzx3t65Py3D/view?usp=drivesdk",
				"https://drive.google.com/file/d/1KXZCuwGEplnBh8hozgOBXINTFPhyU9Ff/view?usp=drivesdk",
				"https://drive.google.com/file/d/1M30BdBcOOTKPSV92MGLnyGvQDEyjM2gI/view?usp=drivesdk",
				"https://drive.google.com/file/d/1uo6-LCNO85U6L6EtzsWXlAQDbDmN0Jeo/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WZ0-gNy2zmey-NQE6z3eeOCve2s-RwFI/view?usp=drive_link",
				"https://drive.google.com/file/d/1KODPELkvCHmVyyjL_uJArUQEVGsqGdU0/view?usp=drive_link",
				
				"https://drive.google.com/file/d/1PIp9zSuNPdNk6jQJ4E6e8jwFtNjqUwnd/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WR_SQSbEi994N3Ib4wvAesdwB6EBDSyO/view?usp=drivesdk",
				"https://drive.google.com/file/d/1x3aEQaxDvCCiP26BLBH1lVYDtiSZeEjk/view?usp=drivesdk",
				"https://drive.google.com/file/d/10OB7VxHYE-M3L_dJ67y9n9ym-QxhCLG2/view?usp=drivesdk"
				
			
				
				
				
				
				
				
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
