package br.com.caelum.lelao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.dominio.servico.Avaliador;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class TesteDoAvaliador {
    
    @Test
    public void main(){
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        double maiorEsperado = 400;
        double menorEsperado = 250;
        
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
    
}
