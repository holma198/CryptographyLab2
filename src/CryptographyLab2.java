// RJ and Avery



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//not the keyword at all: zyzzyva
public class CryptographyLab2 {

	public static void main(String args[]) {
		// Decryption

		String ElenaCiphertext = "bgogcnpldospwiuscpakimqbhgnlxukfgofpbhualuqywnllbcecwabbqleamb" +
				"lmfyolkigwxbvrwzgksdiglkhpgwthbsyevkwlvpifstcodjeghumokuxxgfan" +
				"raizpdlwjlshscwzgsdtxtbguudaxfvvagauqmgadwvfxegxbeeaamvgtsgefs" +
				"ktsyfzuamanvomtvwmzrwpqcdulgbenhesjwaesjhbuttgbedqzpaazefedjtm" +
				"fvumaghelamiugmgsqzpspkalxrzqmtttjmpaswufpvcbnimlmdyahlswympie" +
				"zctkbymecmholuhihlmoibqevhlgssnrgplzwxmmkvvzsdeosegxlfsciiscoi" +
				"voxtwampbwglnrvmutcmhweiikpilamprwcflajenqbrjhbscpvyrosoatpkgw" +
				"cnmqfrufyxavafsimgqajxqrvmygbuoyhphbruogsjmxgvgtthhafxefjdchvf" +
				"tgatrmkmesjsgbqpzvzneswqwrwxkuikqwgnxymolvvmioizdlngddhpfomxom" +
				"whdtczhgfutnmesswmtmsyysemjddltknpfllwrvbsiqdtooygsdztpreghjin" +
				"lamryetcjxikyqtpsitsttidvhkczilgxokiecsikweswwltltltwpziqhcmyb" +
				"ukxuuzxrbhtzjgnrpsookmpgrwapwymwautfwpvmpbcfxhkztktovyfetylvwv" +
				"qqwahavvswilsoiksigrvwdsyrdaqufxdsrbtbdcchtbohnqklatnbuhlgvetl" +
				"pvtdvriyhxyxlxcyifglwyvzmppuhcfoevwecsbddjppzyexyqnwezvdmfxplp" +
				"ofsvefrwtrqcxkiaphenzegyapdjhhplszxkmqiwxgkvzgilamjprmmrleqdrf" +
				"bjzxagvdrqilisccdewlrpsfqpvptzgrtcpwceklemyqgnwutyfemioirvfpvd" +
				"qiyeiulwdktdxyzvpviomiwkyomvtwtvfbflgruvdprbomamvroizftkzhvtan" +
				"hwohgttymyeohaueiglxjvvyavfrzimeyfgkgmpdgwlsspgpeugiurwnzlrrbn" +
				"seiedceclbsakxdmwpcivmsikprmesptjvilaavuvhvdqyvwewmmouwxtnppvw" +
				"zakprxoiilleiyelitaowikkwzlljlthfnxpprlgibpusiowykfzutmmvczxhf" +
				"vjvaxszrmmhzmadsgrieaxkpviqxkvklefoksuquirmrbwphneiyacacrsfrlx" +
				"htaqhlgnsirooftzplewckytmprlpzkgpalmyussmzvayfvtnipszvunzhjxrj" +
				"melvylnxseivgjzxqcubkgnqvbmjhgatiysnnwlbhpcwawzxaxqwcwhmgayjke" +
				"ysieksevwunieiuudqqktalwcoifwzhdjbjwhpndesimswqtsfmipwjmqcaico" +
				"qyovfajxtshzldlsmltxighvrqmnmoebpafeediehshvoahvnpugjippykwfwa" +
				"biirwrhwdhzwzpyxmsidtrmqpaoijcadioxvpwfixpwlzqrohgmcjwbbhkfbua" +
				"hpitrxlwxsaxyezcmmvjiekiawiynsfbhgteyfxjidwtkcvpvowebxpapthgbi" +
				"oiuatemmvhbkkoreileqzamhmjprpcrgthytcbpivwyllvsovkusqxvjvwusfr" +
				"mgsxskksnhjpslpqcubhfqyorgcaelxfazmoeutxnlkhyexeixqnrzsozelstl" +
				"bofmpsxawftnpvthwiceseiebonakbeyraoyvzhyeymynugzzkqiltiorzxawa" +
				"ariaxvbsgmwefshaaswkhyuoctmvtphlvgfrtbgjdjigqolrhzswvlugcfwtrf" +
				"sgaegwhrptvslwsmmydhjrjfutgftxridwdlrlehruvalfxfuymnlnayrrxoat" +
				"epdhlcivmsiivvmnlsukynsmvxysqdftaaqawmfzhvzzofwpnzyeglbkhvjqzn" +
				"punghvxkhyskuhcijmjjpjvjejcwbtnliyquhrugwtwxomdythlblzlcfgceep" +
				"bhoodpggmrjuficfmxbjocwgtgcuwgcielhsieklvgmbqtvwuggvbybwlulhwl" +
				"quahzvfxedbgliixjwfainkfflxdpvzjlauwqgjbkrvvqkwvhtytypguuriexz" +
				"hbpetvkxrambukbwtmrqmqtgtwqmoiluerrdllhestyqmtjdikkbvoiormjmpu" +
				"ddrbhvvvroiekmdrigbukielhaiqfwxujtrmcakmpgvpgzyliyhxyxawbrhihm" +
				"wllskdvwifrtswcounjtnhzgnnodweomgywnaneuuokegyobtlxzlakwwlpkzz" +
				"fkmshiwakhgcwjjeuxiyehuxhqxtltwagjibviamwhrnlloqmniclpwiiikspv" +
				"myssewbcsovvrauhlmdtlwflrfaemunisnpvhnylfviuebsauiqfvbtsppdqvz" +
				"xcibdanztgupilpkdxkawskcfsdxenkgstxbybsbyxkaholpjhefsjwbehfbty" +
				"xwjmnzdxofrwvqiicvxkmpkpqvezkgvnrejxmxqftctlskbavtdkeameglrymd" +
				"mbohpmavjvbewtvpwiljwnyiektmjitywaeggzezsvwipxxdvlwcyqtzdwgcza" +
				"eisibetxwdqftcfotzcsmibkqvdmxywscweelblvkmlbztygefzaedhzppoxnk" +
				"taivjtwmrfcqnxawjvrymfoyahujhlnwmqcanzmbvqllmqdyyfxfjzwgyowzhn" +
				"epyimcygkalzousqtwwqkxlxpvgikcneoeghuxiixtmghdnxftopcvwjsppzlu" +
				"dptovrmqpibdzmofvbnnzattsrqkaceqscigoxxjaoxgaughbrxbnztefeeovv" +
				"ucwrcittsetczfoampwwqktdjxbyadcneigpynsonrigtsyeiomngjjfzxtmlm" +
				"rbpbdhgfgzmdpsekbwpwuvtkjkfqhrnpxkilnredbpzgqtpjcffwkjxjziaiuk" +
				"sexhaljtzindftlwsxjhulxlgviroiuayevzimhwhhgsatiuevtwtbrweseqke" +
				"ewbsolsjgkwuimdlabvfxripasnvxxtzscovihhvppxoohktkqxqmhybkwlhkr" +
				"bagwsintofbukmlsmayievkcjmlkbqtrvzowleupossgsgqnlselxltvqzayfk" +
				"xeiurwzpkuchhtzyeynqihzkgtrupddxyqitzshimtaqnusqtdmpsgavuidvut" +
				"lklgluvvrevgbihtkaqqhnsgrgxhdnshcyndulrsiwbqsjpjhcllxkscpivsqp" +
				"ladnowlnpamgovmosgzvwlugympmgjwlaetmphuaauitismhgqephwzartfdcd" +
				"tchwbvfjqwqassekhutsjrmaiqrmqwzbtmbcudnecbhtpdhicvibprzegmavnx" +
				"ioxvnwmjrztdrhisgkveutiqlqpgrasxkmuinmmawqkitiwiinbjmsefhrglqc" +
				"dasgijmvvfprgbykbulkgohoscscugjlxmbehzcufnllbdqnvcfkfrnignmtke" +
				"caaralfctenwsbphqxhrbwstmxixnajhqabumqprsxvwiaznkumloineqegcwx" +
				"kechldbrwqhpmrlwjcrjjiwtnebephdxtmzwtbxsmqyqzdkaeyufrvslqbwlme" +
				"ybjcagnapjlvhtsthlqltkagubrwoezrfezieomgkqekirqhalatrdvxwlpsdh" +
				"jpxlmsxemohdhxexrgfgkibwadotwdijxbihyjdbhbttgbcyawxgkondonhzvp" +
				"glpilhnvjlwhvweczvpiqhgfdlrcexlgyval";
		shiftKey(ElenaCiphertext,"the");


		//crack(DavidBenCipher2, "holdde");
		//crack(AbeFranciscoCipher, "affobs");
		//crack(SpencerJacobCipher, "pjethaaa");
	}

	public static void crack(String cipherText, String guessedKey) {
		cipherText = cipherText.toLowerCase();

		int keyLength = getKeyLength(cipherText);
		String[] guessedKeyChars = guessKeyChars(cipherText, keyLength);

		String indexHelper = getIndexString(keyLength, cipherText.length());

		System.out.println("**** BEGIN ATTEMPT ****\n");

		System.out.println("Guessing characters of key...");
		System.out.print(' ');
		System.out.println(Arrays.toString(guessedKeyChars));

		System.out.println("\nWorking text: " + decrypt(cipherText, guessedKey));
		System.out.println("Index helper: " + indexHelper);
		System.out.println("\n**** END ATTEMPT ****\n\n");
	}

	public static String encrypt(String clearText, String keyWord) {
		String ciphertext = "";

		String strippedPlaintext = clearText.toLowerCase().replaceAll("[^a-z]", "");

		for (int i = 0; i < strippedPlaintext.length(); i++) {
			char plainChar = strippedPlaintext.charAt(i); // Ascii
			char keyChar = keyWord.charAt(i % keyWord.length()); // Ascii
			int cipherChar = ((plainChar - 'a') + (keyChar - 'a')) % 26; // absolute
			char cipherCharAscii = (char) (cipherChar + 'a'); // Ascii
			ciphertext = ciphertext + cipherCharAscii;
		}

		return ciphertext;
	}
	// Method takes a ciphertext and a key, these will be both the same length in lab 2
	public static String decrypt(String ciphertext, String keyWord) {
		String cleartext = "";

		for (int i = 0; i < ciphertext.length(); i++) {
			int cipherChar = ciphertext.charAt(i) - 'a'; // absolute
			int keyChar = keyWord.charAt(i % keyWord.length()) - 'a'; // absolute
			int clearChar = (cipherChar - keyChar + 26) % 26 + 'a';
			cleartext = cleartext + (char) clearChar;
		}
		return cleartext.toUpperCase();
	}

	///////////////////////////////////////////
	/// LAB 1 Stuff ///////////////////////////
	///////////////////////////////////////////

	// Takes a ciphertext and a key, and applies that key for all positions
	public static void shiftKey(String cipherText, String word) {
		String shiftedWord = word;
		if(shiftedWord.length() < 4) {
			shiftedWord += shiftedWord;
		}
		for (int i = 0; i < word.length(); i++) {
			System.out.println(encrypt(cipherText, shiftedWord));
			for (int j = 0; j < cipherText.length(); j++) {
				if(j % shiftedWord.length() == 0) {
					System.out.print(j);
					if(j < 9 && shiftedWord.length() > 1){
						for(int p = 0; p < shiftedWord.length() - 1; p++) {
							System.out.print(" ");
						}
					} else if (j < 99) {
						for(int p = 0; p < shiftedWord.length() - 2; p++) {
							System.out.print(" ");
						}
					} else if (j < 999) {
						for(int p = 0; p < shiftedWord.length() - 3; p++) {
							System.out.print(" ");
						}
					} else if (j < 9999) {
						for(int p = 0; p < shiftedWord.length() - 4; p++) {
							System.out.print(" ");
						}
					}
				}
			}
			for (int j = 0; j < cipherText.length(); j++) {
				if (j == 0) {
					System.out.println("");
					System.out.print(shiftedWord);
				}
				if(j % shiftedWord.length() == 0 && j > 0) {
					System.out.print(shiftedWord);
				}
			}
			String firstPartOfText = shiftedWord.substring(0, shiftedWord.length() - 1);
			char lastChar = shiftedWord.charAt(shiftedWord.length() - 1);
			shiftedWord = lastChar + firstPartOfText;
			System.out.println("");
		}
	}


	///////////////////////////////////////////
	/// LAB 1 Stuff ///////////////////////////
	///////////////////////////////////////////

	public static int getKeyLength(String cipherText) {
		int returnNum = 0;
		StringBuilder cipherShift = new StringBuilder(cipherText);
		int shiftLength = cipherText.length();
		ArrayList<Integer> matchPerShift = new ArrayList<Integer>();
		int shiftAmount = 0;
		for(int i = 0; i < cipherText.length()-1; i++){
			int curCount = 0;
			shiftLength--;
			shiftAmount++;
			int cipherStartPos = 0;
			for(int shift1 = 0; shift1 < shiftLength; shift1++){
				cipherShift.setCharAt(shift1, cipherText.charAt(shift1 + shiftAmount));
				if(cipherShift.charAt(shift1) == (cipherText.charAt(cipherStartPos))){
					curCount++;
				}
				cipherStartPos++;
			}
			matchPerShift.add(curCount);
		}
		return determineInterval(matchPerShift);
	}

	public static int determineInterval(ArrayList<Integer> intList){
		int returnNum = 100;
		int largestAverage = 0;
		for(int interval = 8; interval > 0; interval--){
			int pointer = interval-1;
			int sum = 0;
			int divisor = 0;
			while(pointer < intList.size()){
				sum = intList.get(pointer) + sum;
				pointer = pointer+interval;
				divisor++;
			}
			if(sum/divisor >= largestAverage){
				largestAverage = sum/divisor;
				returnNum = interval;
			}
		}
		return returnNum;
	}

	public static String[] guessKeyChars(String ciphertext, int keyLength){

		// store characters from each position in array
		String[] charactersByPosition = new String[keyLength];

		// Gathers all characters into like positions
		// outer loop iterates through all key positions
		for (int shift = 0; shift < keyLength; shift++){
			charactersByPosition[shift] = "";

			// inner loop iterates through each character in that key position
			for (int i = 0; i < ciphertext.length() - shift; i += keyLength){
				charactersByPosition[shift] += ciphertext.charAt(i + shift);
			}
		}

		String[] possibleKeyChars = new String[keyLength];

		// loops through every nth position in ciphertext
		for (int i = 0; i < charactersByPosition.length; i++){

			// grab a Hashmap containing frequencies of each letter in string
			HashMap<String, Double> freqStats = getFrequencyStats(charactersByPosition[i]);

			// find the highest frequency letter
			// used this: https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
			Map.Entry<String, Double> maxEntry = null;

			for(Map.Entry<String, Double> entry : freqStats.entrySet()){
				if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
					maxEntry = entry;
				}
			}

			String temp = maxEntry.getKey();
			char mostFrequentLetter = temp.charAt(0);
			char possibleKeyByE = (char) ((mostFrequentLetter - 'e'  + 26) % 26 + 'a');
			char possibleKeyByT = (char) ((mostFrequentLetter - 't' + 26) % 26 + 'a');
			char possibleKeyByA = (char) ((mostFrequentLetter - 'a' + 26) % 26 + 'a');
			char possibleKeyByO = (char) ((mostFrequentLetter - 'o' + 26) % 26 + 'a');
			possibleKeyChars[i] = "Position " + i + ": "
					+ possibleKeyByE
					+ possibleKeyByT
					+ possibleKeyByA
					+ possibleKeyByO
					+ "\n";
		}
		return possibleKeyChars;
	}

	public static String buildKey(String ciphertext, int keyLength){
		String[] possibleKeyChars = new String[keyLength];
		possibleKeyChars = guessKeyChars(ciphertext, keyLength);
		String returnKey = "";
		for(int i = 0; i < keyLength; i++){
			returnKey = returnKey + "" + ((char) ((ciphertext.charAt(i) + possibleKeyChars[i].charAt(0) + 26) % 26 + 'a'));
		}
		return returnKey;
	}

	public static HashMap<String, Double> getFrequencyStats(String cipherText) {
		HashMap frequencyMap = new HashMap<String, Double>();

		//Make a hashmap of all counts of the letters
		for (int i = 0; i < cipherText.length(); i++) {
			if (frequencyMap.containsKey(cipherText.substring(i, i+1))){
				frequencyMap.put(cipherText.substring(i, i+1), (Double) frequencyMap.get(cipherText.substring(i, i+1)) + 1.0);
			} else {
				frequencyMap.put(cipherText.charAt(i) + "", 1.0);
			}
		}

		// For each value of the hashmap, sets to a percentage of occurrences
		Iterator<Map.Entry<String, Double>> iterator = frequencyMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Double> entry = iterator.next();
			frequencyMap.put(entry.getKey(), (Double) (entry.getValue()/cipherText.length())*100);
		}
		return frequencyMap;
	}

	// helper method to print indexes while trying to crack()
	private static String getIndexString(int keyLength, int textLength) {
		String indexString = "";

		for (int i = 0; i < textLength; i++){
			indexString = indexString + i % keyLength;
		}

		return indexString;
	}

}