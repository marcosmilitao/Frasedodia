package com.militao.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Velocidade é controlada por buracos!",
            "Se peito fosse buzina, o mundo não dormia.",
            "Seja paciente na estrada para não ser paciente no hospital.",
            "Melhor perder um minuto na vida do que a vida em um minuto!",
            "Mulher é igual circo, por debaixo do pano é que esta o espetáculo.",
            "Em terra de cego, quem tem um olho vê cada coisa...",
            "Quem não deve, não precisa pagar.",
            "Os últimos serão desclassificados.",
            "Em casa de ferreiro, todo mundo leva ferro.",
            "Antes tarde do que mais tarde.",
            "Um dia é da caça, no outro o tiro falha!",
            "A primeira impressão é a que fica, se o cartucho for novo!",
            "Devagar se vai ao longe... mas demora um tempão!",
            "Águas passadas... não dão cólera!",
            "Para um bom entendedor... meia pala bas!",
            "Em terra de cego que tem um olho... é caolho!",
            "Onde há fumaça... há sempre um chato pedindo para apagar o cigarro!",
            "O que os olhos não vêem, o coração... nem se fala!",
            "Mais vale um na mão do que dois... no sutiã!",
            "Roupa suja se lava... na máquina!",
            "Um homem prevenido vale por dois... mas quem compra?",
            "Água mole em pedra dura, tanto bate... até que cansa!",
            "Quem tudo quer... tudo pede!",
            "Prevenir é melhor que... ser pego de surpresa!",
            "Quem é vivo, sempre aparece... nas horas mais impróprias!",
            "Quem cedo madruga, não pega ônibus lotado!",
            "São nos pequenos frascos... que cabem menos perfurme!",
            "Os últimos serão os primeiros ... a tomar bronca pelo atraso.",
            "Macaco que muito pula ... tem problema psicológico, pensa que é um canguru.",
            "Devo, não pago. Nego enquanto puder.",
            "Em terra de cego, quem tem um olho é 'ciclope'!",
            "Quem não deve, não deve.",
            "Há males que vêm para o bem... mas a maioria vêm para o mal mesmo.",
            "Quem ri por último... ou é surdo ou retardado!",
            "Depois da tempestade... o trânsito pára!",
            "Nunca deixe para amanhã... o que você pode fazer depois de amanhã!",
            "Quem não tem cão... não gasta dinheiro com veterinário!",
            "Quem nunca comeu melado... nunca vai ter cárie!",
            "Quando um não quer... o outro insiste!",
            "Quem tudo quer... fica enchendo o saco pedindo!",
            "Cautela e caldo de galinha não faz mal à ninguém... exceto à galinha!",
            "O sonho não acabou. E ainda temos pão doce, maria-mole e queijadinha.",
            "Se merda fosse dinheiro, todo mundo ia dispensar o troco.",
            "Nos restaurantes baianos, a pressa é inimiga da refeição.",
            "Mais vale um pássaro na mão do que bois voando.",
            "Para bom bebedor meia garrafa basta.",
            "Diz-me com quem andas e te direi se vou contigo.",
            "É chato ser bonito. Mas é muito mais chato ser feio.",
            "É dando que se ganha má fama.",
            "A união faz o açúcar.",
            "Pau que nasce torto, mija fora da privada.",
            "Quem tem boca vai a Roma. Meu fogão tem 4 e não saiu da cozinha.",
            "Se a Montanha não vai a Maomé, Maomé manda buscá-la!",
            "As mulheres tem duas armas terríveis: cosméticos e lágrimas.",
            "Se esta vida é um filme, aonde está o garoto das balas?",
            "Se a Montanha vai a Maomé, a Montanha tem rodinhas!",
            "Não durma no ponto, principalmente se for em Brasília!",
            "Os nossos japoneses são mais esquisitos que os dos outros!",
            "Lacta? Não, Michael Jackson só come Garoto!",
            "Dinheiro não é tudo na vida – dê-me o seu e viva feliz!",
            "Quando um não quer, dois brigam.",
            "Cuida-te para que ninguém te odeie com razão.",
            "As coisas podem piorar, você é que não tem imaginação!",
            "O pior cego é aquele que anda sem bengala.",
            "Tem várias maneiras de ser chato, mas o chato sempre escolhe a pior.",
            "O Brasil não tem imagem no exterior - tem retrato falado!",
            "Acabe com os probemas de seu PC - delete o Windows!",
            "Um químico nunca morre, ele apenas para de reagir!",
            "Cultura enriquece, pergunte aos donos de escola particular.",
            "Se tempo fosse dinheiro, meu relógio seria milionário!",
            "Se o Diabo entendesse de mulher, não tinha chifres!",
            "Quem ri por último é porquê está conectado na Internet via Embratel!",
            "Não dando certo na 1ª vez, desista de pular de pára-quedas.",
            "No avião, o medo é passageiro!",
            "Quanto menos os homens pensam, mais eles falam.",
            "Sou um garoto de programas - faço computação!,",
            "Não, o Ringo não Star... Foi Paul McCartney no correio!",
            "0% do povo não sabe o que é porcentagem, a outra ouviu falar!",
            "O rico pega o carro e sai, o pobre sai e o carro pega.",
            "Tá escrito 'insira o disco 3', mas só couberam 2 no drive..",
            "Se continuar dando pau no seu programa, vamos fazer uma fogueira!",
            "Eu csnoigo digtiar 300 palvras pro seugdno!",
            "Se a EMBRATEL lhe oferecer flores, isto é IMPULSO!!!",
            "Se o dinheiro não lhe traz felicidade, aceito doações!",
            "Quem cala consente - ou é mudo!",
            "A vida é imprevisível: coma a sobremesa antes",
            "Extra!!! Jogadores de Volley promovem nova onda de saques!",
            "Se a Montanha não vai a Maomé, é porquê isto é impossivel. Oras!",
            "Se Maomé vai a Montanha, Maomé é alpinista!",
            "Se a Montanha não vai a Maomé, ... sei-lá!",
            "Quem dá aos pobres tem que comprar camisinha!",
            "O chefe saiu - (T)etris (D)oom (S)trip Poker (O)utro jogo (I)nternet ?",
            "Previna-se contra os vírus - ferva seu computador antes de usar!",
            "Cão bravo perdido. A quem achar, sinceras desculpas.",
            "Falem mal, mas falem em português!",
            "As drogas tiram a memória e outras coisas que eu não lembro mais.",
            "Tá passando mal? Compre um ferro novo e passe bem!",
            "Cachorro que late não morde... enquanto late!",
            "Não brinque com fogo - ele é chato e não sabe brincar!",
            "Já tive amnésia uma vez... ou foram duas?",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();

                int numerosAleatorios = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numerosAleatorios]);
            }
        });
    }
}
