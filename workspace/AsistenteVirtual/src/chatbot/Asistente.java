package chatbot;

class Asistente{
	
	String nombreAsistente;
	Bot darRespuesta;
	
	public String devolverAgradecimiento(String entrada) {
		
		String[] grax = {"gracias", "muchas gracias", "te agradezco", "muy amable"};
		for(int i = 0; i < grax.length; i++){
			
			if(entrada.toLowerCase().contains(grax[i])) {
				
				return "De nada!";	
			}
		}
		return "";
	}

}
