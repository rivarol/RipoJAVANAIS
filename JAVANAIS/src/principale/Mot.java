package principale;

public class Mot {
	//Si voyelle
	public boolean voyelle(char v){
		//Voyelles
		char[] tv= {'a', 'e', 'é', 'è', 'ê', 'i','o','u','y'};
		boolean bool=false;
		lab:for (int i = 0; i < tv.length; i++) {
			bool=(tv[i]==v);
			if(bool==true)
				break lab;
		}
		return bool;
	}
	
	//Si console
	public boolean consonne(char c){
		//Consoles
		char[] tc= {'b', 'c', 'd', 'f', 'g', 'h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
		boolean bool=false;
		lab:for (int i = 0; i < tc.length; i++) {
			bool=(tc[i]==c);
			if(bool==true)
				break lab;
		}
		return bool;
	}
	
	//
	public void converirMotEnJavanais(String mot) {
		//minuscule
		String st=mot.toLowerCase();
		
		char first=st.charAt(0);
		boolean bfirst=consonne(first);
		
		//si first est une consonne
		if(bfirst==true) {
			//Le mot à convertir
			System.out.println("Mot à convertir : " + st);
			
			String ch="";
			boolean bc=false;
			boolean bv=false;
			
			
			try {
				for(int i=0; i<st.length();) {
					char c=st.charAt(i);
					bc=consonne(c);
				
					//si c consonne
					if(bc==true && (i+1)<st.length()) {
						char v=st.charAt(i+1);
						bv=voyelle(v);
					
						//si v voyelle
						if(bv==true) {
							ch +=c + "av";
						}
					}	
					//si c consonne
					if(bc==true && (i+1)<st.length() ) {
						int z=i+1;
						char v=st.charAt(z>st.length() ? i : z);
						bv=voyelle(v);
					
						//si v consonne
						if(bv==false) {
							ch +=c;
						}
					}
				
					//si c voyelle
					if(bc==false && (i+1)<st.length() ) {
						int z=i+1;
						char v=st.charAt(z>st.length() ? i : z);
						bv=voyelle(v);
					
						//si v consonne
						if(bv==false) {
							ch +=c;
						}
					}
				
					//si c voyelle
					if(bc==false && (i+1)<st.length() ) {
						int z=i+1;
						char v=st.charAt(z>st.length() ? i : z);
						bv=voyelle(v);
					
						//si v voyelle
						if(bv==true) {
							ch +=c;
						}
					}
				
					i +=1;
				}
				
				//Ajout du dernier caractère
				ch +=st.charAt(st.length()-1);
				
				System.out.println(ch+"\n");
				
			}catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		//si first est une voyelle
		else if (bfirst==false) {
			//Le mot à convertir
			System.out.println("Mot à convertir : " + st);
			
			String ch2="";
			ch2 +="av"+st.charAt(0);
			
			boolean bc2=false;
			boolean bv2=false;
			
			try {
			
				for(int x=1; x<st.length();) {
					char c=st.charAt(x);
					bc2=consonne(c);
				
					//si c consonne
					if(bc2==true && (x+1)<st.length()) {
						char v=st.charAt(x+1);
						bv2=voyelle(v);
					
						//si v voyelle
						if(bv2==true) {
							ch2 +=c + "av";
						}
					}
				
					//si c consonne
					if(bc2==true && (x+1)<st.length()) {
						char v=st.charAt(x+1);
						bv2=voyelle(v);
					
						//si v consonne
						if(bv2==false) {
							ch2 +=c;
						}
					}
				
					//si c voyelle
					if(bc2==false && (x+1)<st.length()) {
						char v=st.charAt(x+1);
						bv2=voyelle(v);
					
						//si v consonne
						if(bv2==false) {
							ch2 +=c;
						}
					}
				
					//si c voyelle
					if(bc2==false && (x+1)<st.length()) {
						char v=st.charAt(x+1);
						bv2=voyelle(v);
					
						//si v voyelle
						if(bv2==true) {
							ch2 +=c;
						}
					}
				
					x +=1;
				}
				
				//Ajout du dernier caractère
				ch2 +=st.charAt(st.length()-1);
				
				System.out.println(ch2+"\n");
				
			}catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		//
		else {
			System.out.println(st);
		}
	}

}
