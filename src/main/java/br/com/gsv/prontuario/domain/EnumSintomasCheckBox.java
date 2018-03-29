package br.com.gsv.prontuario.domain;

public enum EnumSintomasCheckBox {

	RADIONIVNORMAL("Normal"), RADIOALERTA("Alerta"), RADIOLETARGICO("Letárgico"), 
	RADIOOBNUBILADO("Obnubilado"), RADIOTORPOROSO("Torporoso"), RADIOCOMATOSO("Comatoso");

	private String valor;

	private EnumSintomasCheckBox(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}

/*
 * radioAgitado = new JRadioButton("Agitado"); radioAgitado.setBounds(456, 115,
 * 109, 23); painelAnotacao.add(radioAgitado); radioAgitado.setFont(new
 * Font("Arial", Font.PLAIN, 13)); radioAgitado.setBackground(Color.WHITE);
 * grupoBotao2.add(radioAgitado);
 * 
 * radioTriste = new JRadioButton("Triste"); radioTriste.setBounds(369, 115, 85,
 * 23); painelAnotacao.add(radioTriste); radioTriste.setFont(new Font("Arial",
 * Font.PLAIN, 13)); radioTriste.setBackground(Color.WHITE);
 * grupoBotao2.add(radioTriste);
 * 
 * radioAlegre = new JRadioButton("Alegre"); radioAlegre.setBounds(269, 115, 98,
 * 23); painelAnotacao.add(radioAlegre); radioAlegre.setFont(new Font("Arial",
 * Font.PLAIN, 13)); radioAlegre.setBackground(Color.WHITE);
 * grupoBotao2.add(radioAlegre);
 * 
 * radioApatico = new JRadioButton("Apático"); radioApatico.setBounds(186, 115,
 * 81, 23); painelAnotacao.add(radioApatico); radioApatico.setFont(new
 * Font("Arial", Font.PLAIN, 13)); radioApatico.setBackground(Color.WHITE);
 * grupoBotao2.add(radioApatico);
 * 
 * radioCalmo = new JRadioButton("Calmo"); radioCalmo.setBounds(103, 115, 70,
 * 23); painelAnotacao.add(radioCalmo); radioCalmo.setFont(new Font("Arial",
 * Font.PLAIN, 13)); radioCalmo.setBackground(Color.WHITE);
 * grupoBotao2.add(radioCalmo);
 * 
 * radioEstNormal = new JRadioButton("Normal"); radioEstNormal.setFont(new
 * Font("Arial", Font.PLAIN, 13)); radioEstNormal.setBackground(Color.WHITE);
 * radioEstNormal.setActionCommand("Calmo"); radioEstNormal.setBounds(23, 116,
 * 70, 23); painelAnotacao.add(radioEstNormal); grupoBotao2.add(radioEstNormal);
 */

