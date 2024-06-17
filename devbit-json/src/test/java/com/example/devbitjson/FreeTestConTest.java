package com.example.devbitjson;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(FreeTestCon.class)
public class FreeTestConTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FreeTestCon freeTestCon;

    @Test
    public void testListRest() throws Exception {
    	
    	
    	//List<Photo> photos=Arrays.asList(new Photo.Builder().withId(1).withUrl("url1").build(),new Photo.Builder().withId(2).withUrl("url2").build());

        when(freeTestCon.listRest(1)).thenReturn(getPs(1));

        mockMvc.perform(get("/freerest/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(0))
                .andExpect(jsonPath("$[0].url").value("https://drive.google.com/file/d/1PIp9zSuNPdNk6jQJ4E6e8jwFtNjqUwnd/view?usp=drivesdk"))
                .andExpect(jsonPath("$[1].id").value(1))
                .andExpect(jsonPath("$[1].url").value("https://drive.google.com/file/d/1WR_SQSbEi994N3Ib4wvAesdwB6EBDSyO/view?usp=drivesdk"));

        verify(freeTestCon, times(1)).listRest(1);
    }
    
    //not support 0 add if
    
    public List<Photo>  getPs(int pn){

		System.out.println("req###" + pn);

	//	System.out.println("req" + i++);
		
		List<String> urls= Arrays.asList(
				
				
				
				"https://drive.google.com/file/d/1PIp9zSuNPdNk6jQJ4E6e8jwFtNjqUwnd/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WR_SQSbEi994N3Ib4wvAesdwB6EBDSyO/view?usp=drivesdk",
				"https://drive.google.com/file/d/1x3aEQaxDvCCiP26BLBH1lVYDtiSZeEjk/view?usp=drivesdk",
				"https://drive.google.com/file/d/10OB7VxHYE-M3L_dJ67y9n9ym-QxhCLG2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1UMp5j0t9pn7oVG9MX9a82ZGqJ3_XK7qG/view?usp=drivesdk",
				"https://drive.google.com/file/d/1anF1FCb20S0HqiqT1UhPCD_V4XASx_Qy/view?usp=drivesdk"
				
				
			
				
				
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
    
    
    
    
    
    
    
    
}
