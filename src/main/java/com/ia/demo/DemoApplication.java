package com.ia.demo;

import com.ia.demo.views.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import sun.awt.AppContext;

import java.awt.*;

@SpringBootApplication
public class DemoApplication{
	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(DemoApplication.class)
				.headless(false).run(args);
		Main main = ctx.getBean(Main.class);
		main.setPane();
		main.setVisible(true);
	}

}
