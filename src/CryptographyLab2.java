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

		// PART 1

		String plaintext = "Cracker Barrel's menu is based on traditional Southern cuisine,"
				+ "with appearance and decor designed to resemble an old-fashioned general store."
				+ " Each restaurant features a front porch lined with wooden rocking chairs, a stone "
				+ "fireplace, and decorative artifacts from the local area. Cracker Barrel is known for"
				+ " its partnerships with country music performers. It has received attention for its "
				+ "charitable activities, such as its assistance of victims of Hurricane Katrina and "
				+ "injured war veterans. Employees there wear a choice of either white, yellow, blue "
				+ "or pink shirts.";
		String key = "zyzzyva";
		String ciphertext = encrypt(plaintext, key);

		// PART 2

		String ElenaCiphertext = "qjapkofclpgauficevhvujgebkgtdjhzctdssphzrvgnrbvvoccgueecjvolblkezgljejhmfyftspacmrknxwfhoiasvifbkaskseuiecjfeihgutlrqvhvvafdvbsupvqluowhzgspglgmjqjapkofclpgauijikgdkctterqzerpdlqgiohjitgweuiwlaspglgmjoffgrwfcctskutfhzgcfblgnkggheeqjapksvoejgsiejsngnztljetfqrtfujcpywumepwkwnbbgynzbsfdzhaqnkcectysectzqsnaeodaszgghcimhvoxfsrhzqsngffavhdgutyghspacmkkszbunuuskvhvglwdpcxuiusujaebwnakhsekjhzctucfqtkojiekkwckeskuejwfvhvqjapkcytagvaeacugtikveutyseuecjwublhapskssfeoddqikkwckeskuejwfvhvwjkmgzwoeehsvifb";
		String KyleCiphertext = "GMEAZPIECBKEPVRFIRSTGKNNQXRZUAFXUQYOPSXLURTRBBIYBMZBUOFEAIIPPYABUSGEPBYNOHRDKAUWOCZBGTRZYBOEYMDCFVVMTPFWRFVRSMRVIRTAUQIUNMYTOBOWBNVEJWBVKETLNDKFVJSMXREXVUKNOHNOGVOMGQYGIIVVYVEIFBUEZSSIIBOGRVZEBXVWTPBQCBUYEFLWTRPJVBYFVVIQBBSWGPOFUEYMOFOSGKUADIEVKQXMGPZUFKEMGGISEZUETAUQIUIEIMGYSINLEOFIALKFDVVJKQPJGMTROSHONGISHONYFWFWLGFROMRVFZRLHHUAVBNGIIZCRGJXHLKBGWZIRYUSEUKAUWVVUGIIEEUEEWVBOYMXEGZBBRFEKEULVAWHFWGQUAISJEGFFZRZEQBCYQLRJRNKUADIABXNUMBVINNTEMLYFGGMJVOXUMSVOHBNZUFEIMXNHICZOFPRRZSBTXBNZUFIIMTGTHRAIEJFRLNRSIQQJAPXGIQRQPNKKVOXUMRNSKRITQGEZWAFDEZXYOVXVVZUFWZIRYPRRACUFVRUUFUSSBNRSINTKKUIEUOABXVWTGPSXXRNDIGPOFTXBZEVTRBBGOPYGBNRTYSNKEJRTITQEINBNBGKEMGGIIEWKFBRQUGEUCEATBSMFQZNCSHBZUFTEWSVOIABINQSFXXVTSAMXFXLBIIGFHNAZEVWGMKFIEIQTTTTRKONMTEQBVMITMYBSARTRXOSJVVEJWBVKETXUCYVUMFVUGTSZCIUDSAKKEOIQEOGIXUMYHGJRZOAHWBNZUFQVONGZFHBCVULGPKFBGEQLVDIFBNRDVHKOSJBVWTNOHGPKQFEGPYBGXUMMEFEGIXZZSSCTXOSJVGAEYAZKPPVQMJIJGGQSFJXJIYGIIFMIBNQBVVEJWBVKETAUWHBSIAWJVTXVVMHJWUQTTNEESYBOXUMOETPRMBRTAUWSGIIPIVBTVRIRYZHRAVVTIQENVMIGPKFFSELOABVLKN";
		String DavidBenCipher = "DVBGVBAOQEWMSSXVHIOWTFVPBFFFGPASUUSEYCHUHFVTNNFDOSINHIWSSPSEACUUSSVHFNRCHHIRRFCSSLJFFSJFKJJVMVQPBFPSKIPQIISSAIFTSEYSEVGUOSGYCVYKINNFWVJEITLSLJWUOVJFGXLHFOFFLHIVGQPFFQVBAVJRJFYMIBZUHRIRSUOHIRHFKFFPFPWDFFOEAVFLCHLGPRVBAVJGVFYONUWTOOMSSDVISFMSVSBQGNHZFSCXSSTZOLLAFYCEFSUUOUZZFCSBSHIRWHOHXVHIVDFLSTVDSVYFAVIRABAISRWIPFDBFBNSTGVBSCHRTPSYUBUPVCQVZHYWNNUFZOECOMTSSFTPYHPFSLLGUEOVNSTGFPKSTGCGLFFUOMDSTPCVAVFVGPKFZYCELGBQGQLQJNZMFTSBAFCSSLGIPFFFSELCGRUFSCEGCDHIURFCBFZGVFFKFQSUOSIBZZIZJFTVSABEHJYTPEHPZSLRHIHHIRAIHHIUCMWSXUOUOOUGVFFKFESTLYF";
		String KaiMarkCipher = "wsrrrbdrwllhuegfpvvlgveezyckxuludsjolfddpfafttsbuuwppfarwllrhtnwpbbewteazldyifhjadmgouthvlayhrjbybduiavuioijhqilhoyyckwqveavajogazxgochjvrlawvayzaglipogcnpbbbebxfaftdvraawalnajxlwvuudlmaycblqoyycjibmyhovbbbcvavaghalragblssugvoxgoyialrnppcifhjanecplvdmqlcklvlvltsigzddyxuoghzteprtprgocroyejflhcchrwzxbnjxkinublljnppxlwgoyikseblqfxulrgptylftjeglqilezmpdtxulnglwruatvjgochbrsvjavavueshvxuchzpvrcpkvrhkcvanycuysypacvxntmjzifoyashvzrjyfgoghoeysmllhuvshlmntqtuxjprwivbvkqljbycivwjlcealrkshafrogckxulbdvvbicgvrgopdbkuaftoshzcvpzrnyioieplvsmtorqfxulbthhnubsysjzwupvrlttycrsdpuhshggfwcygillbwyhsmtorpzfvybuyszipxlvnubiomfkgiacnmrtyqrzgcneakbpugrpriymcwgcnplagihrvhdxywgycwleezcnvyezmcnflymilxblyroabybpdeeijxukavrtoeakgcoeakuxalshggfkehatdmysutzmanyckfylqhalvznahgrvztysaumlbrgpjioioycprsskynalevsvoxupqwvyflcpjlshggfwgyynasgocqlwgipxkiolblppydclompoznbwfoyasfylqhlholyckxulghzyraftyipycpairccgzlnsjqljbyrjueglqdzlnsjpspgocrvycschalelctcieapjlmasmkprticpuhgocqssgzmuuegbptzlnubhoeysldamaaftpvvzqjlwghlsuiilpbvproyglpvwldywphpcvvzhpzwvbkgvpshzqjjlnzyglhrznxziqplchxvcgifwuhjabtburwlmejfxshellqlavafiomfmgtshqlurvrflaghxrlttycshggfxnrcwpwthgihrqlyrowrccghppoybiieijtzwgopdbkuafxztnsyrlavafhdiranthgrhlsalrvuclvbmgiiprzrtciezfpspvuqpmigfptzxgygehanfkpriavqihczlcitinsjqffelyzvjqhwebgxpdllwuhbddwuhttvjsllslhgogcrfharwpwnubpspvzktuhrkrwhxlvswhzrisizphtztyiqocglaupjtalrzckpwvvlhkmqhneleehlsalvzuthonubxkprafttiavkdyilpcakmanzjaeqycptkruralwqvldavrwptoiakgufshwygksadclppytcckeakyhpezhlwvrrzrebgxpdlllnccjuinyltkphjicvagvqrhtraftziewccawgvlvbijluxspzhithqrubhlvrsmcniyzcioicbazhpvhprhpyzmvvsqugvoxhurdfshhjanmilktfshyfpuhfpdllfrmpxlrqzyckvbigczlnsjglwgvpthqrubh";
		String NathanLeahCipher = "FHMSBRAGIETYWOKHYEVGXDLRECZVITQBZONNIOTLMLXUTBMGUCKVIHMEIAASHRUHXABRWBGYQOVOTTBVETINEBMEFIIEHUVQROCEMEMAEIFGRSMIQNIAWUARPAURMATPUPPRKDQFOTWFPIBPTBMGPEMAOIXUXRIYBHIOXTANXBMEMIAFKSBRFOVYKSEVMCPRPATCAAJRFSISMEZFQVMETLEBDDANGDAJUTKUXSERDEQAWIKNFELORWZVFIVTMHMYQTBRKONGTEKBKRMFBOVQBNONXPPNUEBVZTPRVIXUQRBRQTTNFEZWHHIAZEAGKIBUQMQHLIVUUSEBKKXBXYOETPPVMEEUBCPJMSKBFPTRFELVGMIAGSKEBPBSARUVGFQSFEMAHEQTTTJHMFQEETXHULQFTELVGFQSFEMAXIOUFEMABNDRZTMQMHMGMBCYTRMPFAIPKIBVOATPHMXBZEVGHFBUQVQTXNMEQCQCAEZ";
		String JohnAhnafCipher = "CAXCUIECTPABWSCATSWVPPOMHHRTPOXFIINVCIOQEYGEUOURQTQXNGWSKXTSGSPUBAEVLLTMWIPTCGALIRREJIGAQIIVMKNDPQKONRHMDVWULDQPVPXMHRZHBAEFVZYVAAYIMGKHMHYYKBXDOIDUJRTKITTAAAUIODMEIHJDYMHBVICXMMHDRMABAELVDJIKEGQTUOBVLRRUEAIFLLTMBNWLPOIBNHBEGZGAOPJFQKEFXPFQGTKITTIGAOCDGAOAUMZWAEYPEOGWYAOEDVIBROEFFMKBDGVIMHRJIDJMIAUHWALBAZIWNAYRDRNKAVAUZPTIGNDAPVPXRHPWCVWEPICAAMALRPUBAEFVZYVFEQLLXMUEFSXGUHRHEYFUHRHWFIOXSWMGGLXSSMEGBAEIENVBAAWRZVPBNJLLUJXEQTCQDXNQSMQLRHDWMGMGTUMPFIGDQSYGEBNISCOIMIRRSCAVOPIEQTBGKXEJMBREIWKMYSKEGGJXCRQPOWKEIEYEQYUOXSGQKHBTZVPXSHWWGALPUENVQVAOXSGQKCRYYUMELHWDIMKMDRPWVVOQJTTUXDVYDRQVIRREGVWSRZPTBBMHXZDMVOPIHKTYUOJLNTTCLSFUIGDSVPABHTKIGKKBSVMEWLXSRJXQWWIWENSCBRHWLNTMHHUFCTBTLIDQNVOPQZPANPHVDVQMIRRLPLMHHQPPWYTKINTWPNKSEGTPHRWPPMQUVSQCTEEJMLPKXIVWEKBVHHHLHBXRDPWKVMHHFCKOATWLCGIWOIXTOMTNGQZVQHNKEGGTBKHEWNUXNQSTOUNNLXJVWBNIPFGVVE";
		//String SpencerJacobCipher = "TJZGVLPAVKUINJWFOYJBBRIZYKNCHJPHOUKHUYFATUFBYWFGTTPALFMFDCKOAYBHRQRQUUTACJDOLGZSLNGFBZMTINZHLDMALCJVBPFSNFECGNMJTKTIYYDDYYZHGWNATQWWANGLIUXCVLSLOVLFAGZLOCIIAMZKTTZBTMROOTUGVUMKANNOLQFGLFJOLUTSTAFIGFUFKCERJGFZCQEJVAFAOPECFSBWRHCIBSEANHFFZYFAOPNVNRUKMAGCVLFNONLBGYDALAYOABUUARGWAEOGMOLBVAMLIQEHUMGYHQEHUGEKINCMFSNASPFHZWSGANECEBAAFKERVRRMNCERPFDASVZHFJAFGFZRARFZIPBWJMGDDNRQXYNALKKMGMRANKJVGFUKTCJYVLMKAVZGSYOLOTPKNWNMTKRAQGZANIFBNFGEINZHLRMJTPFKUYTSAVIMNRMHUPUCVQAMNFYIZYZ";
		String DexterXuejiaoCipher = "mlpvtkzeeewapmjuxvpehcelmseibdvkhycsehzfbwxegclgweyccsnmxgsrdzfzbglpprmtggpwiwcebexmcqixwmmpnsovbxphppfnmxsieckxgxteadflbxtztclmvsxihcwjneyxjathftfxxbxyksxjxbubgkyilqlkxwesswjxtwpwicyxettrvrzlvsgigbvpiecxxqcxlmelxbbmamdmhhyxfsdxtltbmiomwomxuiprxbdrxremgsttkipvlsjahywhqswhvydmcufnkiyiguptlqfgwcemaiashwkboizyiqffxwlwlstnkvprizptkieltbvztxtztcexlwzgpzcxwufechlfvsxqjbzvtxtscgzlhrpsuhyxfscixbkxkidxxbxtitwmrokbhrdtaoegxhqsghyxyyeygsfyjylriidvhqayiwezkidipftaxvdmcqybgelrssclxasigszgmlpadfcwaegiqsxngiitacibgkeltdfmxrempzfyuytpswezjylriidgxxhsgyjnlmykivvltqptgwevbtwihpvabroujoemnqnsbdlmbrrxwstkxeemdbfymlpwtbvmpscohkfnehpztbkntpwcddvgmlphdciyhvlujoemnqtrisigxxlqdfvlxgfvtqfffyymrokbhrdchhvfbrhlxqybgjzvbokbhrtwhhfkxhlrshitgwxmihvwpmelprmtggphrfpimsrvpdyrlynlpbvmpscowcnxoicgdicwgxmiiflervpeawqxwyyxxzhntreybqffiyeiggsxvsxihqretfwilvzvajfxjfzlfvpessilmltrzkzeellteseuxjzvthnhsicsuwmxsicslocftvemhouwbrrvdpfmlxzmignhkoqsgqvtlmegdbkbgypwicjabjemchftlxzvttihgxqsghyxfsoigbnhkpoxwsixmetptfytlfpichvlmmykivvkhfzxhwetgyxftffylxzvtgzgtvvecgrliiyrhmcotrtepbuvtptjdfebtasigskaxccijgvwyscvtdvtmemptdixwmnxppcxtroqpbltexlwzgkaxdpvdgzqhrpqthvkmazjihreevzfdhjtkipujwgixhhmivrmhapvpbutlicmtgfyvexigojtgheltmdhoiftpbuwhayexgcxlwnecbzgzwsiajvlyscsjhfylxzgzwkxfwthtbkbyctrvwevhvcirhgkbgpwpbumtotrvbfmxsqagcezhvxmhgzgzplftzjwtxlmhhyxgtlwhsuhgxzibdchripwlvfiksnitrkhlxzgzwkxfwlrsqfkkinxbwjmtopwxbzmbewxtgklhjeltffuhxdlpjvuxiywjqtxlwqyasehnksjdfnteqlvihfxqtlrshyxbvcsqckyeipxicrghxsigtzoxdpvdgkhkiderffllxsirclgmvjfjgzgxwdmcgzwxvciecimlxsmhsoitrdmdbnbepmircdieieisppmaiprscwctrfegmkphdpvdcexxmrlikybeicihsrkvlpvhvroxqlrpuvwmsnvtokxjylriidvhqayisilmlpcpfvtepmyayptghzramnhkotrhdvvbewmosuxgztvdbdxgxdxwsixysciivvynxfvtcwjneyxjathftfxxbxftctrrzlwxxsiprfimmzrdtremicrphzoxwesivvlrweibgtnkvprizpuxmykrfvtmiomcqlmmmyktrxxeemsgokhkmpwivvitxsjdfntkhxenpvmavzyvvkaxgciphzhgsqwestbtptdtrthftfxtftabtdgpdrueizjuievmmzrxbxebopujoemnqnsbdlmxvdfjhjtgweltgktmizjivvtkxnsbdfgxrewivflxwjwisdlkibyxfvmaibypbknfgzqeikbgkcikccnmmzrrclewewwdkveefpkxbnbmleltomxkeriesilhrlgrsjlbrrefirgmyxgdagnmicxwffnzllgaclwliczxqvlngsehhyhlitfboewzszkasytoinvtokxwmelxbbrhycivczgzxzwtsxxgiceaomtbplfxzzmrsqwxaletxzvhoewxqfpphfklxseioixnwpjjzzgmlprtlkmpsqsjfdhgxswhozwaycptmjmbpwxwcjxlcdxtajphywhyijmuiltaotxaswhtfwhkxsigsrewilplvzvalpwtsjtkvtzxbxbgxsiccklhhtwioemyyeygszphywhacmxmsditolgbzpvhocjneyxjathftfxtfrotmweqzvtlilvawvktwelgsvmhjtztmvtkwzyioewbfppxsmxmllxrclewfptdgjbupp";
		String DavidBenCipher2 = "AKBFPSPZMVUBKHIRGMPHILHPCSTQWENMSROENWNOZFPHIRKBISBYZNPATLKFYSUUSCVFPTCWLGBQHILAPZSSHHIFCVAUSNPFISXNFFAVFWOCISSJCDRAZFCUOSKNKTAVBGPJASUUSDSOXFHIHHDNHDOPFJOSLHIRXVIXVOPJYRBQGIBHIRTSBAJBITIOERFTHHDUVFACPXVJZJPEDBSGXBFEPVBQZPNHJZSUOSNNLPTSGBSILGPHUIAGPESTASEUSCFHIRHVTHVZHSLSBQGUVCENKIPZFVHIVIHUHBKOTVIGMWTUHIVIHUHILGUBCEAVFWOCISSJCDRKJGVFFSTBTGSONRQBTSXUWGMZJTHIYCVTVUOSUHZHLMXBCEHRCHFCSSENGJAQBZSPLHXBCFAKPNRUOFPHUIHRUUFPBUIGVFCCSCOMIZBQSXLHTVQLLFTNQLOSMRTUPHEROEHRXVHIPHTUSBKVFJSUNOMHAQOWHOODROEUOTAHIBITSOJGVFQOCOSSDCDXQPTSUBAZHFNFAZISBZWTOPPLCGYOCWCVZRBLQBSZPBVDHZMNMILQIBFUSSEVVJZXPLHXHGCEWMSWHNRUOSTYWUOMUBJFZRJQUZYSBQUJTPMRWUOSXNPFHZMZWNZMXRFFAVFOCSVUPISTHRUUSNVAFEOUOGPHHHYOCR";
		String AbeFranciscoCipher = "LQCENOEJGCFHPYGOIVZGXYCBQQGCZJEQCCFHYMPPUXJMRSWNXMPXYNHDJJDLSMMOJVSYIXKBOFJAPBQYWMXNJEJVRPWRVHFTXGOMKFBMJXJBENPXROWJHSEVPYIHNBQLYMKJERCGFGPMICFHLSOFRYIMIETNPQASFGXYCFLGHYYCJGWLYMJUZGYRKZELYSCQXGGPJEWTDRXFDYQMETGLJAEUEKNSCBJENSJNEBJLYBSQOLRGKJYGFEJMACFHNQXEEGENPXROWJHRFLKSXEEAKRHEILXPDRXLKSMTLCEKBSZACYGSETWQVLRCLWOSKJWQKEJFELBSLGPFVXSVCIDRUYUDMSEGZMJVJNNYCWRVZUVWTBQLXMCZWLNMDCGGIWRYSYTWJBCPJYTUUJVHPFPYIHZFDLJRFGQLOMCWKFIKRQOZTGLGDGHSLGWLYAFAHYYCXNZQWC";
		String BlakeMattCipher = "TEMTUTKMGEGOIABAZMFFEPBWEAJCZFIPBOSEXMFABFKQMPXKWFYQMGFTEIHBRLOFQSPQJQLVOSFSJWFQDFNTUCRTHMSFBQANQQBGEPBVQTTWNQRLUSFEOXOOEOBSETTQZXBBOWZIKBVDEBHSDOPMQANAAZUNBCDMTQPSETXZHFHBZIZNFVUEPBMRETXZHESIWKXYYCHSEQATMSQMFQAZPAUNRBSMFQMFKORPSMRQPWESFOBMLXAWZGIMZMPPPCGLAJSOOJXZQTBLSMCEBWYEVWITEXZHTIPACGNAZSYEJJSDTLZIZIKIGFRXQUTTIQBQAKLFGNXAZANDIGBOPAWNLBBVQSBKCZDQQAQYLCTMIIBCOOJXZQTBIZMPYMTARBBVQSLCBPYLCFFEPBWEOSMFFHBBSETTQZXBBOWZOKBVQWLZRETXZHANVWIDMXZYSEQZSMDVAHMRQ";
		String JohnSungJaePrinceCipher = "caeehiohknmzhrkatcfhvmcqojsgkiiounhfzmkzgjcahakwidrbosxqzdeghqvjmawvqxyayabguefjjernumcqlavglpvwxwmslxcgugwylovoknizdozfmplvqkjmvwwjhkfsrkrtwlvjkwwbqmjlnwxjheiwzkinflgdgpjbuqrkzdildvvfusgnopvvojxuhxisjaardvvlgepbumeyzdinwprfzegjrvblnwxpdrwazexohwklxumajxfzkhtlrydsqawrqwvglplrzsidjpsxhigquqmaisiekzeagielknxnlrvvzdvbxkyonwxryiiekzmhpcfmlerqpsjlikrthrzsrbseryihxergpexsferrdruganieheuwxahvwmffysinuitgtpmaxmeyzkhryskwskrgkwfxxatbuxzfmwrqzvzlojkgrgiwgpiclitwyhmxhnfknqetuivfylvbimcwojxulwzkyqibixiwgoyebwvuxaxnuckaskxubkvazdrrueevxkfruxucglpnqwrkyawfpielubxuharjojesjlrfooxnqjfjzdijhfjazainflusesicusumiahbciekubtbvxjstwplcmeyhninnmeyjazrosgekjxflrggrexvfwsmyerrvwtmrpyehxvunjsyrkpstzsgkiikaxnrfxjkuiibixywshsajxzeklvrrgtmvwxvrrjglplrdxcstpmprxywxojnlvcqtaagrecdubyfdwzoxexrrrfmxomghmtstoirssjlylscsmeyalflmedwybeyosnkgxshwxnazpieecrfjnijvycdoreadffmzplriykmxassjepkojxuhqzdopeebeevhuxnqiyayegbdxvkgxshwxywskvnogfmxwkrrjtabepjdvxwtavnokvgxciuhriqzdszdwnzgpqnwxvjypshvmesrhxuhafjqplnwavvukrjkekwbavcoekxunqzdcgjkoiawmkkkhjvvxywwqeylxpstzgbqwviaarphswstehrdeevzdipoeiazueagtfoknsslxjwdlvrvwzgtsiohpzwbaeagavtkhmryikzgpcbxfvdoazrwlrlubxuhqrfewrqsvfdobiedxzfmiinqwwgxyszpyeaiwxvqksamehrdwffkkjgkidgypisiitlorinqhkzknisrvveuoxrqhljojkvvjzuzesa";

		crack(ElenaCiphertext, "oscar"); // required
		crack(KyleCiphertext, "benign"); // required
		crack(DavidBenCipher, "hobnob"); // required

		crack(KaiMarkCipher, "hyphen"); // extra credit 1
		crack(NathanLeahCipher, "maintain"); // extra credit 2
		crack(JohnAhnafCipher, "citadel"); // extra credit 3
		crack(DexterXuejiaoCipher, "teleport"); // extra credit 4
		crack(BlakeMattCipher, "axiom"); // extra credit 5
		crack(JohnSungJaePrinceCipher, "gwenders");

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

	//////////////////////////////////////
	/// PART 2 ///////////////////////////
	//////////////////////////////////////

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