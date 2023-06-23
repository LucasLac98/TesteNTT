package br.com.ntt;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class PesquisaTest {

	private static final String URL_GOOGLE = "https://www.google.com";


	private WebDriver browser;

	@BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	}

	@BeforeEach
	public void beforeEach() {
		this.browser = new ChromeDriver();
	}



	@Test
	public void pesquisarPessoaEngenheiraDeDadosNoSiteNTT() {
		//Abrir Chrome no site do google
		browser.navigate().to(URL_GOOGLE);

		//Inserir NTT DATA e clicar em pesquisar
		browser.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Ntt data");

		//Clicar em Pesquisar
		browser.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

		//Clicar no primeiro Resultado
		browser.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[1]/div/a/h3")).click();

		//Clicar no Carreiras
		browser.findElement(By.xpath("//*[@id=\"navbarLevel0Collapse\"]/div[2]/ul/li[2]/a")).click();

		//Clicar no oportunidades de trabalho
		browser.findElement(By.xpath("//*[@id=\"collapseRight1\"]/ul/li[2]/a")).click();

		//Trocar de Aba
		browser.getWindowHandles().forEach(tab->browser.switchTo().window(tab));

		//Pesquisar Por Pessoa Engenheira de dados
		browser.findElement(By.xpath("//*[@id=\"sGlobal\"]")).sendKeys("PESSOA ENGENHEIRA DE DADOS");


	}



}
