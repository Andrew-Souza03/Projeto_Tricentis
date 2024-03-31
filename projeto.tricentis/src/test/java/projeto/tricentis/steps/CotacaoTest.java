package projeto.tricentis.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import projeto.tricentis.drivers.Drivers;
import projeto.tricentis.elementos.Elementos;
import projeto.tricentis.metodos.Metodos;
import projeto.tricentis.navegadores.Navegador;
import projeto.tricentis.pages.HomePage;
import projeto.tricentis.pages.InsurantDataPage;
import projeto.tricentis.pages.ProductDataPage;
import projeto.tricentis.pages.SelectPricePage;
import projeto.tricentis.pages.SendQuotePage;
import projeto.tricentis.pages.VehicleDataPage;

public class CotacaoTest extends Drivers {

	Elementos el = new Elementos();

	@Dado("que esteja na home do site")
	public void queEstejaNaHomeDoSite() {
		Navegador.abrirNavegador();
	}

	@Dado("abra o formulario")
	public void abraOFormulario() {
		HomePage.iniciandoCot();
	}

	@Dado("preencha todos os campos")
	public void preenchaTodosOsCampos() {
		VehicleDataPage.enterVehicleData();
		InsurantDataPage.enterInsurantData();
		ProductDataPage.enterProductData();
		SelectPricePage.selectPrice();
		SendQuotePage.sendQuote();
	}

	@Então("terei a cotacao com sucesso")
	public void tereiACotacaoComSucesso() {
		Metodos.validarCotacao(el.msgSucesso, "Sending e-mail success!");
		Navegador.fecharNavegador();
	}
}
