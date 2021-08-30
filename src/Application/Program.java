package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment ("Wow, thats awesome!");
		Post 	p1 = new Post(sdf.parse("21/06/2021 13:05:29"), "Travel to New Zealand", 
							"I'm going to visit this wonderful country!!!", 12);
		
		//Adicionar comentarios ao post!
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
	
}
