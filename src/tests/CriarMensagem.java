package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CriarMensagem {

	@Test
	void test() {
		
		//apontando o local do driver do googlechrome.. Mesma versão 
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		
		//Abrindo o navegador do googlechrome
		WebDriver driver = new ChromeDriver();
		
		//Acessar a página desejada
		driver.get("http://localhost:4200/faleconosco");
		
		//maximizar a janela do navegador
		driver.manage().window().maximize();
		
		//preencha o campo 'nome'
		driver.findElement(By.xpath("//*[@id=\"nome\"]")).sendKeys("Marcio Nascimento");
		
		//preencha o campo 'email'
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mlrnrj2011@hotmail.com");
		
		//preencha o campo 'telefone'
		driver.findElement(By.xpath("//*[@id=\"tel\"]")).sendKeys("21997334640");
		
		//preencha o campo 'mensagem'
		driver.findElement(By.xpath("//*[@id=\"msg\"]")).sendKeys("Teste funcionou");
		
		//clicar no botão enviar
		driver.findElement(By.xpath("//*[@id=\"gravar\"]")).click();
		
		//ler a mensagem obtido pelo sistema
		//String mensagem = driver.findElement(By.xpath("")).getText();
		//Verifica mensagem
		//assertEquals(mensagem, "Preenchido com Sucesso");
		
		//fechar o navegador
		//driver.close();
		
		
	}

}
