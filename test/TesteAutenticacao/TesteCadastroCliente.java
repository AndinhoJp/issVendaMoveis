/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAutenticacao;

import Autenticacao.ControleAcesso;
import Autenticacao.ControleLogin;
import ControleCliente.ControlaCliente;
import Entity.Acesso;
import Entity.Cliente;
import Entity.Funcionario;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ander
 */
public class TesteCadastroCliente {

    ControlaCliente controlaCliente;
    Cliente caso[] = new Cliente[5];

    public TesteCadastroCliente() {

    }

    public void setUp() {//TESTE COM OS DADOS ESSENCIAIS PARA A CRIAÇÃO DE UM NOVO CLIENTE
        controlaCliente = new ControlaCliente();
        Date date = new Date(2000, 07, 02);


        caso[0] = new Cliente("99999999990", "Fulano", "Sobrenome", "99999999999", "000", date, "Rua de Teste", "100", "1", "Maringá", "Paraná", "1", "1", "1", "Maria", "José", "Masculino", "Bairro", "Solteiro");// TESTE COM TODOS OS DADOS VÁLIDOS
        //DADOS RELACIONADOS AO CPF E POR CONSEQUENCIA, O ID DO CLIENTE POIS AMBOS COMPARTILHAM A MESMA INFORMAÇÃO
        caso[1] = new Cliente("", "Fulano", "Sobrenome", "", "Rua de Teste"); // TESTE COM CPF NULL OBS. O CPF E O CLIENTE ID SÃO UTILIZADOS AS MESMAS INSTANCIAS POR ISSO AMBAS ESTÃO EM BRANCO
        caso[1].setCliId("99999999999");
        caso[1].setNome("Sobrenome");
        caso[1].setSobrenome("Sobrenome");
        caso[1].setCpf("999999999");
        caso[1].setRg("123");
        caso[1].setDataNascimento(date);
        caso[1].setEndereco("Rua");
        caso[1].setNumero("100");
        caso[1].setComplemento("");
        caso[1].setCidade("Maringá");
        caso[1].setEstado("Paraná");
        caso[1].setTelFixo("");
        caso[1].setTelMovel("");
        caso[1].setEmail("");
        caso[1].setNomeMae("Maria");
        caso[1].setNomePai("José");
        caso[1].setSexo("Masculino");
        caso[1].setBairro("Bairro");
        caso[1].setEstadoCivil("Solteiro");
        
        caso[2] = new Cliente("99999999999", "Fulano", "Sobrenome", "99999999999", "Rua de Teste"); //TESTE COM CPF VÁLIDO
        caso[3] = new Cliente("99999999990", "Fulano", "Sobrenome", "99999999990", "Rua de Teste");//TESTE COM CPF INVÁLIDO
        //TESTE COM NOME E SOBRENOME
        caso[4] = new Cliente("99999999999", "", "Sobrenome", "99999999999", "Rua de Teste");// TESTE SEM O PREENCHIMENTO DO NOME
        caso[5] = new Cliente("99999999990", "Fulano", "", "99999999990", "Rua de Teste");//TESTE SEM O PREENCHCIMENTO DO SOBRENOME
        //TESTE COM ENDERECO
        caso[6] = new Cliente("99999999990", "Fulano", "Sobrenome", "99999999990", "");//TESTE SEM O PREENCHIMENTO DO ENDERECO
    }

    public void testPersisteCliente() {
        System.out.println("Testando o ControlaCliente()...");
        assertTrue(controlaCliente.cadastraCliente(caso[2]));
        System.out.println("Caso 0: OK!");
        
    }

}
