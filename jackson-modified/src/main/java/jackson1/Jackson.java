package jackson1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import jackson1.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//import org.junit.Before;
//import org.junit.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.thoughtworks.xstream.XStream;

public class Jackson {
	
//	private XmlMapper xmlMapper = new XmlMapper();
	
//	private Person person;

	public static void main(String[] args) throws Exception , IOException{
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("sarah");
		person.setAge(10);
		person.setSex("male");
		person.setTelephone("12345678");
		List<String> friends = new ArrayList<String>();
		friends.add("mattew");
		friends.add("phoenix");
//		String[] friends = new String[2];
//		friends[0] = "mattew";
//		friends[1] = "phoenix";
		person.setFriends(friends);
		
		XmlMapper xmlMapper = new XmlMapper();
//		String xml = xmlMapper.writer().with(SerializationFeature.WRAP_ROOT_VALUE).withRootName("person").writeValueAsString(person);
//		System.out.println("xml:" + xml);	
		System.out.println(person);
		//String xml = xmlMapper.writeValueAsString(person);
		//System.out.println("xml:" + xml);
		XmlMapper xmlMapper2 = new XmlMapper();
		//xmlMapper2.enable(SerializationFeature.INDENT_OUTPUT);


		xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String xml4 = xmlMapper.writeValueAsString(person);

		System.out.println("xml4:"+ xml4);
		
//		xmlMapper2.enable(SerializationFeature.INDENT_OUTPUT);
//		xmlMapper2.writeValueAsString(person);
		
		//System.out.println(xmlMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(person));
		//xmlMapper2.enable(SerializationFeature.INDENT_OUTPUT);
	}

}
