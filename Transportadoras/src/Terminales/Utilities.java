package Terminales;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
 

    //crear un arraylist con los sigyientes datos :
    String[] nombre = {"COOINTRACAR LTDA",
        "COOTRAIMAG LTDA",
        "COOTRANSAR LTDA",
        "COOTRANSMOTAR",
        "CIA DE TRANSPORTES LA PROVINCIA SA",
        "AEROTAXI S.A.",
        "ARCOTRANS",
        "ASOCIACION TRANSPORCOL",
        "ASOTRANOSUR",
        "ASOTRANSE S.A.",
        "AUTO EXPRESS",
        "AUTO FACA S.A.",
        "AUTO FUSA S.A.",
        "AUTO LINEAS LAS ACACIAS LTDA",
        "AUTOLEGAL S.A.",
        "AUTOLUJO S.A.",
        "BASA",
        "BERLINASTUR S.A. ",
        "BUSEXPRESS LTDA ",
        "CARDELSSA S.A.",
        "CHACHAFRUTO",
        "CITRACOM LTDA",
        "COFLONORTE",
        "COINTRASUR LTDA.",
        "COINTUR",
        "COMBUSES",
        "COMPANIA DE TAXIS VERDES S. A.",
        "COMULTRASIM LTDA. ",
        "CONDUCCIONES LAS ARRIERITAS S.A.",
        "CONDUCOOP",
        "COOAUTOARIARI",
        "COOBURQUIN ",
        "COOCATRANS",
        "COOCHACHAGUI LTDA",
        "COOCHOFERES PEREIRA",
        "COODETRANS PALMIRA LTDA",
        "COOETRANSALCA",
        "COOFLOTAX",
        "COOINTRABOS LTDA",
        "COOINTRACUR LTDA",
        "COOINTRANSOCEANICA LTDA",
        "COOINTRANSVIAS LTDA",
        "COOINTRASAN LTDA",
        "COOINTRASMAR",
        "COOMOCAL ",
        "COOMODEQUI LTDA.",
        "COOMOEPAL",
        "COOMOFU LTDA",
        "COOMOQUIN",
        "COOMOTOR LTDA",
        "COOMOTORFLORENCIA",
        "COOMOTORISTAS",
        "COOMULCOD",
        "COOMULSORA",
        "COOMULTRAL LTDA",
        "COOMULTRANSVILLA",
        "COOMUTRAN ",
        "COONCOR",
        "COONORTE ",
        "COOP. ORO BLANCO LTDA.",
        "COOP. TRANSP. DE TIMBIO",
        "COOP. TROCOROMA LTDA.",
        "COOPCACIQUE ",
        "COOPESTRAM LTDA.",
        "COOPETRANS TRUJILLO LTDA",
        "COOPETRANS TULUA LTDA",
        "COOPETRANSA",
        "COOPEXTAN",
        "COOPMOTILON LTDA",
        "COOPRISAR",
        "COOPROTAXI",
        "COOPROYECCION",
        "COOPTRANSANMATEO ",
        "COOPTRANSMARGINAL",
        "COOPTRANSORIENTE",
        "COOPTRATAM",
        "COOPUERTOS LTDA",
        "COOTAX TUNJA",
        "COOTAXLUJO LTDA",
        "COOTAXTAMBO LTDA.",
        "COOTAXTUQUERRES LTDA",
        "COOTRABE",
        "COOTRACAICE",
        "COOTRACAIME LTDA.",
        "COOTRACAM",
        "COOTRACAR",
        "COOTRACEGUA LTDA",
        "COOTRACERO LTDA",
        "COOTRACESAR LTDA",
        "COOTRACHICA",
        "COOTRACHIPILIN",
        "COOTRACIBOL",
        "COOTRACIR",
        "COOTRACOL",
        "COOTRACOSTA S.A.S.",
        "COOTRADELSA LTDA",
        "COOTRADELSOL LTDA",
        "COOTRAFLUVSUC",
        "COOTRAFUN",
        "COOTRAGAL",
        "COOTRAGAM LTDA",
        "COOTRAGEN LTDA",
        "COOTRAGUA",
        "COOTRAGUA LTDA",
        "COOTRAIBIRICO",
        "COOTRALIBANO LTDA",
        "COOTRALSINU LTDA.",
        "COOTRAM ",
        "COOTRAMAN LTDA",
        "COOTRAMARINI",
        "COOTRAMEQUE",
        "COOTRANAR LTDA",
        "COOTRANCISE",
        "COOTRANDES LTDA",
        "COOTRANGEL",
        "COOTRANS DE OCCIDENTE",
        "COOTRANSA",
        "COOTRANSAGUAZUL",
        "COOTRANSALBANIA",
        "COOTRANSAMARIA LTDA",
        "COOTRANSANF ",
        "COOTRANSARARE LTDA",
        "COOTRANSARAUCANA LTDA",
        "COOTRANSARIARI ",
        "COOTRANS-AYASI",
        "COOTRANSBEL",
        "COOTRANSBOL LTDA",
        "COOTRANSCAJICA",
        "COOTRANSCAQUETA LTDA",
        "COOTRANSCAQUEZA LTDA",
        "COOTRANSCAR",
        "COOTRANSCARIBE LTDA",
        "COOTRANSCASTILLA LTDA.",
        "COOTRANSCHI LTDA",
        "COOTRANSCHINCHINA",
        "COOTRANSCIEN ",
        "COOTRANSCOL",
        "COOTRANSCOMPARTIR LTDA",
        "COOTRANSCONDOR",
        "COOTRANSCOR",
        "COOTRANSCORD LTDA",
        "COOTRANSCOTA LTDA ",
        "COOTRANSCOY",
        "COOTRANSCUM LTDA",
        "COOTRANSDA",
        "COOTRANSDIPAZ",
        "COOTRANSDORADA",
        "COOTRANSDOVIO",
        "COOTRANSE LTDA.",
        "COOTRANSERMA LTDA",
        "COOTRANSESPINO LTDA",
        "COOTRANSFLORENCIA",
        "COOTRANSFOMEQUE LTDA",
        "COOTRANSFONTIBON",
        "COOTRANSFUENTEDEORO LTDA.",
        "COOTRANSFUNZA LTDA",
        "COOTRANSFUSA LTDA",
        "COOTRANSGANADERA LTDA.",
        "COOTRANSGAR",
        "COOTRANSGIGANTE LTDA",
        "COOTRANSGIRARDOT",
        "COOTRANSGLORIA",
        "COOTRANSGUACHUCAL",
        "COOTRANSGUAJARO",
        "COOTRANSGUALMATAN LTDA",
        "COOTRANSGUAMO LTDA.",
        "COOTRANSGUAVIARE ",
        "COOTRANSHACARITAMA LTDA",
        "COOTRANSHUILA LTDA",
        "COOTRANSIBO",
        "COOTRANSICONONZO",
        "COOTRANSLIBERTAD LTDA",
        "COOTRANSLLANOS LTDA",
        "COOTRANSLOMA",
        "COOTRANSMAGDALENA",
        "COOTRANSMAR",
        "COOTRANSMAYO LTDA",
        "COOTRANSMELGAR",
        "COOTRANSMONGUISITA",
        "COOTRANSMUNDIAL LTDA.",
        "COOTRANSNEVADA",
        "COOTRANSNORCALDAS",
        "COOTRANSNORTE",
        "COOTRANSORIENTE",
        "COOTRANSOVE",
        "COOTRANSPER LTDA.",
        "COOTRANSPIBU LTDA",
        "COOTRANSPLATENA",
        "COOTRANSRIO LTDA.",
        "COOTRANSRIO LTDA.",
        "COOTRANSROSAL LTDA",
        "COOTRANSSA LTDA. ",
        "COOTRANSTEFLUARAUCA LTDA",
        "COOTRANSTEQUENDAMA.",
        "COOTRANSTIBACUY LTDA",
        "COOTRANSTOCAIMA",
        "COOTRANSTOL",
        "COOTRANSTOL LTDA",
        "COOTRANSTUR ",
        "COOTRANSTUR LTDA.",
        "COOTRANSUNIDOS",
        "COOTRANSUNIMAG",
        "COOTRANSURB LTDA",
        "COOTRANSUROCCIDENTE",
        "COOTRANSVAL",
        "COOTRANSVAL LTDA",
        "COOTRANSVALLE DE SAMACA",
        "COOTRANSVALLE LTDA.",
        "COOTRANSVI",
        "COOTRANSZIPA ASOCIACION COOPERATIVA",
        "COOTRAPAI",
        "COOTRAPROSANTA",
        "COOTRARIPORO LTDA",
        "COOTRARMERO.",
        "COOTRARS",
        "COOTRASAL",
        "COOTRASAM",
        "COOTRASAN",
        "COOTRASAN",
        "COOTRASANA",
        "COOTRASANDINA",
        "COOTRASANJUAN",
        "COOTRASAR",
        "COOTRASARAVITA",
        "COOTRASBET",
        "COOTRASIN LTDA",
        "COOTRASUCRE",
        "COOTRASURMAG",
        "COOTRASVAL",
        "COOTRAUR",
        "COOTRAUR",
        "COOTRAYAL",
        "COOVERACRUZ LTDA ",
        "COOVICTORIA LTDA",
        "COPETRAN LTDA.",
        "CORTA DISTANCIA",
        "COTAXI",
        "COTRADATIL LTDA",
        "COTRAFRON LTDA.",
        "COTRANAL",
        "COTRANS LTDA",
        "COTRANSCAT",
        "COTRANSFEBO S.A.",
        "COTRANSRICAURTE LTDA.",
        "COTRANSTAME LTDA",
        "COTRANSVILLA LTDA ",
        "COTRASANGIL LTDA",
        "COTRASOATA",
        "EMPRESA ARAUCA S.A.",
        "EMTRASUR",
        "EMULIR LTDA",
        "ENTAN S.A.S.",
        "EXALPA S.A",
        "EXCOLCAR S.A.S.",
        "EXP. LA SABANA",
        "EXPASA",
        "EXPRE-BELMIRA S.A.",
        "EXPRESO BRASILIA S.A.",
        "EXPRESO CAFETERO S.A.S.",
        "EXPRESO DEL PACIFICO S.A.S.",
        "EXPRESO DEL SOL S.A.",
        "EXPRESO FLORIDA.",
        "EXPRESO FUSACATAN LTDA.",
        "EXPRESO LA ORTEGUNA E.U.",
        "EXPRESO LAS LAJAS S.A.",
        "EXPRESO LOS COMUNEROS S. A. S.",
        "EXPRESO SIDERAL S.A.",
        "EXPRESO SURAMERICANO H 24 S.A.",
        "EXPRESO TREJOS",
        "EXPREVIENSA",
        "EXTRA RAPIDO EL NORTENO S.A.",
        "FLOTA ANDINA LTDA",
        "FLOTA AYACUCHO S.A.",
        "FLOTA CORDOVA RG",
        "FLOTA EL CARMEN S.A",
        "FLOTA FREDONIA S.A.S",
        "FLOTA GRANADA S.A.S.",
        "FLOTA HONDA LTDA.",
        "FLOTA LOS PUENTES S.A.",
        "FLOTA MAGDALENA S.A.",
        "FLOTA METROPOLITANA S.A.",
        "FLOTA NORDESTE",
        "FLOTA RIONEGRO S.A",
        "FLOTA SAN VICENTE SA",
        "FLOTA SUGAMUXI S.A",
        "FLOTA VALLE DE TENZA S.A.",
        "FLOTA ZIPA LTDA.",
        "FLOTAOSPINA SANABRIA",
        "FONSECA EXPRESS LTDA",
        "GAITANA TOUR",
        "LA ANDINA",
        "LA COSTEÑA",
        "LINEAS DEL VALLE",
        "LIPSA S.A.",
        "LOS DELFINES O.C.",
        "MONTEBELLO",
        "MONTRA S.A.S.",
        "MOSARCOOP",
        "NUEVA FLOTA BOYACA S.A.",
        "NUEVO TRANSPORTES CHOCO LTDA",
        "OJINEGRO",
        "OMEGA LTDA.",
        "PAPAGAYO",
        "RADIO TAXI TAME LTDA",
        "RADIO TAXI UPARS. LTDA",
        "RAPIDO AEROPUERTO LTDA",
        "RAPIDO EL CARMEN LTDA",
        "RAPIDO LOS CENTAUROS",
        "RAPIDO MEDELLIN RIONEGRO",
        "RAPIDO OCHOA",
        "RAPIDO SANTA LTDA",
        "RAPIDO TAMBO LTDA",
        "RAPIDO TOLIMA S.A.",
        "RENACIENTE S.A.",
        "RIO TAX S.A.",
        "RIVERMAG",
        "SAN NICOLAS",
        "SANTRA LTDA.",
        "SIDAUTO S.A.",
        "SONATRANS LTDA.",
        "SOTRACAUCA S.A.",
        "SOTRACOR S.A.",
        "SOTRADORADAL S.A.",
        "SOTRAGOLFO",
        "SOTRAGUR S.A.",
        "SOTRAM S.A",
        "SOTRAMAGDALENA S.A.",
        "SOTRAMAR S.A",
        "SOTRANDES S. A.",
        "SOTRANSNORTE",
        "SOTRANSODA",
        "SOTRANSPA",
        "SOTRANSTOCAREMA S.A.",
        "SOTRAPEÑOL",
        "SOTRARETIRO",
        "SOTRASAB",
        "SOTRASABAR S.A.",
        "SOTRASAN S.A.",
        "SOTRASANVICENTE Y GUATAPE LA PIEDRA",
        "SOTRAUR",
        "SOTRAURABA",
        "SOTRAYAR",
        "SUAUTOMOVIL S.A.",
        "TAX CARTAGO S.A",
        "TAX CENTRAL",
        "TAX LA FERIA",
        "TAX META S.A",
        "TAX PARAMO S.A.",
        "TAXANDINA",
        "TAXBELALCAZAR",
        "TAXIS LA SABANA",
        "TJPT",
        "TM",
        "TRAINES S.A. ",
        "TRAN QULICHAO",
        "TRANPORTES CALIMA S.A.",
        "TRANS - EXPRADERIO S.A.",
        "TRANS GALVEZ",
        "TRANS INDUSTRIALES PUERTO ISAACS",
        "TRANS LA VEGA LTDA",
        "TRANS LOS TOLUES",
        "TRANS PETROLEA S.A.",
        "TRANS PRIMAVERA LTDA",
        "TRANS RENACER LTDA.",
        "TRANS SALONICA SA",
        "TRANS TOBAR LTDA",
        "TRANS TORO LTDA",
        "TRANS VILLA RODAS",
        "TRANS YUMBO",
        "TRANS. PUERTO TEJADA",
        "TRANS. PURIFICACION S.A.",
        "TRANS. RISANORTE S.A.",
        "TRANS. VIRGINIA S.A.",
        "TRANSANDONA S.A.",
        "TRANSCAMBIA LTDA.",
        "TRANSCARIBE EXPRESS",
        "TRANSCOBOY S.A.",
        "TRANSCOGUA LTDA",
        "TRANSCUNDINAMARCA",
        "TRANSDIAZ S.A.S.",
        "TRANSEGOVIA ",
        "TRANSEGUA ",
        "TRANSGALAXIA S.A.",
        "TRANSGONZALEZ S.C.A",
        "TRANSGRACOL S.A.",
        "TRANSIBUNDOY S.A.",
        "TRANSINIFANAES LTDA.",
        "TRANSIPIALES S.A.",
        "TRANSLEBRIJA",
        "TRANSMAR",
        "TRANSNEIRA S.A.",
        "TRANSORIENTE",
        "TRANSORIENTE S.A. ",
        "TRANSOTOMAYOR S.A.S.",
        "TRANSP JUAN B VASQUEZ CIA S C A",
        "TRANSP. BERMUDEZ S.A",
        "TRANSP. CUNCHIPA",
        "TRANSP. VILLETAX S.A",
        "TRANSPIEDECUESTA S.A.",
        "TRANSPINO S.A.",
        "TRANSPORTES ALIANZA S.A.",
        "TRANSPORTES ARGELIA Y CAIRO S.A.S.",
        "TRANSPORTES ARIMENA S.A",
        "TRANSPORTES ARIZONA S.A.",
        "TRANSPORTES AUTO RIO Y CIA LTDA ",
        "TRANSPORTES AUTOLLANOS S.A.",
        "TRANSPORTES BUGA LTDA",
        "TRANSPORTES DINAMARCA S.A.",
        "TRANSPORTES ESMERALDA SAS",
        "TRANSPORTES GOMEZ HERNANDEZ S.A.",
        "TRANSPORTES GRAN CALDAS S.A.",
        "TRANSPORTES GUASCA S.A.S.",
        "TRANSPORTES IRRA S.A.",
        "TRANSPORTES LA ESPERANZA S.A",
        "TRANSPORTES LA GUAJIRA",
        "TRANSPORTES LA IBAGUERENA",
        "TRANSPORTES LUZ S.A.S.",
        "TRANSPORTES MORICHAL S.A.",
        "TRANSPORTES MUISCAS S.A",
        "TRANSPORTES PERALONSO LTDA",
        "TRANSPORTES PROVIDENCIA S. A.",
        "TRANSPORTES RAPIDO AMAGA S.A.S.",
        "TRANSPORTES SALGAR S.A.",
        "TRANSPORTES SENSACION LIMITADA",
        "TRANSPORTES SUPEREXPRESS S.A.S.",
        "TRANSPORTES TISQUESUSA S.A.",
        "TRANSPORTES UNIDOS DEL NORTE",
        "TRANSPORTES UNION",
        "TRANSREINA S.A.",
        "TRANSSANDER S.A.",
        "TRANSTEBAIDA S.A.",
        "TRANSTEUSACA",
        "TRANSTIERRA GRATA",
        "TRANSTOCARINDA S.A.",
        "TRANSUNIDOS LOA CEJA",
        "TRANSUR SA",
        "TRANSVALVANERA S.A. ",
        "TRANSYARY S.A",
        "TRASANJORGE TSJ LTDA.",
        "TRASURAN S.A.",
        "TRATAM S.A.S.",
        "TRNSPORTADORES DE VITERBO S.A.",
        "TSA",
        "TTES PROGRESO DEL CHOCO",
        "TTES SAFERBO ",
        "TTES VELORIENTE",
        "TTRANSGUAMUEZ S.A.",
        "UNIGASMELGAR",
        "UNITRANSCO ",
        "USATRANS S.A.",
        "VALLECAUCANA DE TRANSPORTES S.A.",
        "VELOTAX",
        "YAMEYA",
        "COMPAÑIA LIBERTADOR SA",
        "EXPRESO LIBERTADOR LTDA",
        "TRANSPORTES CISNEROS - ENTRERRIOS LTDA Y CIA S.C.A.",
        "TRANSPORTES SAN ANTONIO DEL TEQUENDAMA SAS",
        "TAXIS FURATENA S.A.",
        "TRANSPORTES GACHETA S.A.",
        "SOCIEDAD COMERCIAL SERVIAJES LTDA",
        "TRANS UNISA S.A.",
        "CONTINENTAL BUS S.A.",
        "TRANSPORTES LA VERDE S.A.",
        "EXPRESO DEL ATLANTICO S.A",
        "EMPRESA DE TRANSPORTE LA BELENCITA S.A.S.",
        "TRANSPORTES LOS FARALLONES S.A.S. ",
        "TRANSMERCEDES S.A.S",
        "EXPRESO VALLE DE ATRIZ S.A.",
        "SOCIEDAD LANCEROS EXPRESO S.A.S.",
        "FLOTA SANTA FE LTDA.",
        "AUTOBOY S.A",
        "FLOTA LA MACARENA S.A.",
        "FLOTA AGUILA S.A.",
        "FLOTA RIONEGRO CUNDINAMARCA S.A.S.",
        "EXPRESO BOLIVARIANO S.A.",
        "EXPRESO DE LA SABANA S.A.S.",
        "COMPAÑIA METROPOLITANA DE TRANSPORTES S.A.",
        "EXPRESO GOMEZ VILLA SAS",
        "FLOTA CHIA LTDA.",
        "AMERICANA DE TRANSPORTES TERRESTRES LTDA",
        "NUEVA TRANSPORTADORA DE BOGOTA S A",
        "AUTO SERVICIO CHIA LTDA",
        "TRANSPORTADORA EL TRIUNFO S.A.",
        "TRANSPORTES VELOSIBA S.A.",
        "EXPRESO GAVIOTA S.A.",
        "TRANSPORTES ARMENIA S A",
        "NUEVO RAPIDO QUINDIO S.A",
        "TRANSPORTES LA COSTEÑA VELOZ S.A.S.",
        "TRANSPORTE COSTA AZUL LIMITADA",
        "EMPRESA DE AUTOVILES CADIZ S.A.",
        "EMPRESA DE TRANSPORTE FLOTA CACHIRA LTDA",
        "EMPRESA DE TRANSPORTES LUSITANIA S A",
        "RADIO TAX S.A.",
        "EMPRESA DE TRANSPORTES SULTANA DEL VALLE S A.S",
        "TRANSPORTES EXPRESO PALMIRA S.A.",
        "TRANSPORTES MEDIA LUNA S.A.",
        "EMP DE TRANSPORTES RAPIDO EL CARMEN S A",
        "EXTRA RAPIDO LOS MOTILONES S.A.",
        "SONAR- INVERSIONES EXPRESO MEDELLIN SONSON ARGELIA Y CIA LTDA S.C.A",
        "TRANSPORTES TAMESIS LTDA Y CIA S C A",
        "TRANSPORTES GUATAPE LA PIEDRA Y CIA LTDA",
        "SURANDINA DE TRANSPORTES S.A.",
        "EXPRESO VALPARAISO CARAMANTA S.A.S",
        "FLOTA HUILA S A",
        "COOP LABOYANA DE TRANSPORTADORES LTDA. COOTRANSLABOYANA",
        "EXPRESO SAN JUAN DE PASTO S.A.",
        "COOPERATIVA ESPECIALIZADA SUPERTAXIS DEL SUR LTDA",
        "FLOTA GUAITARA S A",
        "AUTO PANAMERICANO DE TRANSPORTES S. A.",
        "EXPRESO JUANAMBU S A",
        "TAXIS LA FRONTERA S A",
        "RUTAS DEL SUR S A",
        "TRANSPORTES GINEBRA S.A.",
        "EXPRESO PRADERA PALMIRA LIMITADA",
        "FLOTA OCCIDENTAL S.A.",
        "TRANSPORTES FLORIDA S.A.",
        "TRANSPORTES BATERO S.A.",
        "TRANSPORTES TATAMA S. A.",
        "TRANSPORTES ZAPATA S. A.",
        "TRANSPORTES APIA S A",
        "EXPRESO ALCALA S A",
        "EL RAPIDO DUITAMA LTDA.",
        "NUEVA TRANSNOVITA S.A.",
        "EMPRESA DE TRANSPORTES PATUMA LIMITADA",
        "TRANSPORTES UNIDOS BUGA S.A.",
        "EXPRESO FENIX LTDA.",
        "STITANQUES LMITADA",
        "BERLITUR S. A. S. ",
        "EXPRESO EL CERRITO S.A.S.",
        "TRANSPORTES LINEAS DEL VALLE S.A.S.",
        "EXPRESO BARI S.A.S.",
        "CATATUMBO TRAINDLS S.A.S.",
        "PANAMERICANA EXPRESS SAS"
    };    
     
    String[] nit = {
        "8000684552",
    "890480666",
    "8904812847",
    "8919010070",
    "8080007689",
    "8909289702",
    "8002324286",
    "9002931253",
    "9000273537",
    "8919012274",
    "8240065427",
    "8600093550",
    "8906000201",
    "890600427",
    "8908000629",
    "8908022061",
    "8900000593",
    "8600156241",
    "8060123641",
    "8001024074",
    "8909032294",
    "8001904632",
    "8918000457",
    "8907005985",
    "8001241961",
    "8909203975",
    "8600077017",
    "8001742069",
    "8909045981",
    "8001642826",
    "8001464921",
    "8900000862",
    "8918555343",
    "8140002855",
    "8914000894",
    "8913000594",
    "8919010049",
    "8918000432",
    "8240000292",
    "8002311628",
    "8140009497",
    "8002256323",
    "8002119445",
    "800206977",
    "8000839531",
    "8900004969",
    "8903030817",
    "8605173915",
    "8900000902",
    "8911002791",
    "8911005565",
    "8915000451",
    "8002099692",
    "8918012092",
    "8190000746",
    "8001585231",
    "8909103481",
    "8110023909",
    "8909056802",
    "8910010093",
    "8915005934",
    "8904005655",
    "8900002686",
    "8904031008",
    "8919018470",
    "8919002549",
    "8909083747",
    "8140009813",
    "8001520281",
    "8001791443",
    "8907035506",
    "8913003915",
    "8001682634",
    "8002158871",
    "9000381561",
    "8001169567",
    "8908003014",
    "8918005891",
    "8912016234",
    "8140016236",
    "8912014134",
    "8001407934",
    "8919003927",
    "8907006779",
    "8120024427",
    "8917005918",
    "8923003657",
    "8918552578",
    "8000993374",
    "8918000441",
    "8230021605",
    "8000483691",
    "8900014671",
    "8001852976",
    "9010873505",
    "8001959675",
    "8918553250",
    "8922009324",
    "8900027045",
    "8901101737",
    "8923001905",
    "8900030841",
    "8921152584",
    "8923004204",
    "8240021694",
    "8907051978",
    "8002436566",
    "8900017549",
    "8908026698",
    "8002516900",
    "8240019459",
    "8912002807",
    "8913007330",
    "8000940804",
    "8110098736",
    "8919003128",
    "8901049215",
    "8002516212",
    "901351446",
    "8001803251",
    "8000053357",
    "8905041452",
    "8820114706",
    "8000943389",
    "8240037381",
    "8914016991",
    "8001741569",
    "8000974262",
    "8911003551",
    "8000736874",
    "8912244427",
    "8917010216",
    "8001935801",
    "8002414791",
    "8908023869",
    "8900028580",
    "8000949206",
    "8000680463",
    "8918557586",
    "8000860501",
    "8000193381",
    "8000929468",
    "8002475068",
    "8912241880",
    "8000704652",
    "8001159143",
    "8460000450",
    "8919022863",
    "8919006154",
    "8908058824",
    "8002045429",
    "8911005447",
    "8001099496",
    "8001065364",
    "8002053577",
    "8000675484",
    "8906003238",
    "8911900007",
    "8911008165",
    "8911012010",
    "8906000559",
    "8240010921",
    "8000698882",
    "8000106122",
    "8370000401",
    "8907015768",
    "8220029646",
    "8905054247",
    "8911002997",
    "8917011783",
    "8001997147",
    "8010000425",
    "8001092965",
    "8240026251",
    "8902707383",
    "8914082351",
    "8912017961",
    "8907065760",
    "8070068096",
    "8000810958",
    "8001930332",
    "8908023378",
    "8907021222",
    "8000935001",
    "8001980027",
    "8000425035",
    "8900014838",
    "8001756113",
    "8907029242",
    "8908012612",
    "8000999380",
    "8002122220",
    "8001422520",
    "8600168170",
    "8001132613",
    "8906004694",
    "8907010172",
    "8001927059",
    "8000860753",
    "8910007469",
    "8905011197",
    "8001213251",
    "8904806354",
    "8001475678",
    "8002136307",
    "8002243370",
    "8918004324",
    "8460005483",
    "8002544850",
    "8600315795",
    "8923011268",
    "8060019073",
    "8001057169",
    "8907029228",
    "8002028875",
    "8002037183",
    "8001923601",
    "8250013826",
    "8290032552",
    "8909060331",
    "8002437310",
    "8180002992",
    "8070007109",
    "8902015099",
    "8110064708",
    "8001108816",
    "8922012353",
    "8190052752",
    "8110050954",
    "8002323342",
    "8250026058",
    "8001445105",
    "8906000566",
    "8919008437",
    "8902009287",
    "8905003887",
    "8902002186",
    "8918556707",
    "8000611982",
    "8905004466",
    "8902002115",
    "8001755770",
    "8320035042",
    "8902077806",
    "8920994211",
    "8603511226",
    "8902035073",
    "8001643999",
    "8908002560",
    "8240056209",
    "8250035821",
    "9013339413",
    "8002286841",
    "8901014210",
    "8230004507",
    "8000528698",
    "8909112574",
    "8901005318",
    "8002152840",
    "8180005919",
    "8002021330",
    "8913006515",
    "8080002434",
    "8001877912",
    "8912016915",
    "8600472411",
    "8908002729",
    "8320045022",
    "8903015779",
    "9001197843",
    "8001220235",
    "8600011802",
    "8600011811",
    "8909251244",
    "8909071943",
    "8909031730",
    "8909118960",
    "8907002619",
    "8907020106",
    "8600048383",
    "8908007468",
    "8909014919",
    "8909031762",
    "8600221051",
    "8918000758",
    "8600091436",
    "8600272835",
    "8908003039",
    "8250034769",
    "8911045588",
    "8919009689",
    "8901014131",
    "8002040729",
    "8914003573",
    "8001082724",
    "8000042838",
    "8000602725",
    "8002000745",
    "8001683822",
    "8919003855",
    "9001295216",
    "8600144939",
    "8903027977",
    "8001736669",
    "8002099614",
    "8903161377",
    "8600137978",
    "8920015295",
    "8909040823",
    "8909028758",
    "8600020823",
    "8915001949",
    "8907004765",
    "8904004363",
    "8908006570",
    "8002156320",
    "8922004957",
    "8909116283",
    "8600029501",
    "8600102056",
    "8915005515",
    "8910000938",
    "8909365751",
    "8909180928",
    "8909128111",
    "8600757031",
    "8902706615",
    "8000503562",
    "8600475606",
    "8000799464",
    "8909146058",
    "8020075643",
    "8300300862",
    "8909111702",
    "8909131821",
    "8922001612",
    "8909140912",
    "8000178921",
    "8909128331",
    "8110065168",
    "8909027601",
    "8110349381",
    "8908007135",
    "8919001185",
    "8914003430",
    "8908001849",
    "8920001130",
    "8900023540",
    "8912242667",
    "8915002771",
    "8002007158",
    "8909109703",
    "8909032311",
    "8002071888",
    "8002369468",
    "8913009701",
    "8600300808",
    "8919000306",
    "8903010746",
    "8000305982",
    "8919028285",
    "8905002871",
    "8919001415",
    "8001536742",
    "8919016671",
    "8919000012",
    "8919000313",
    "8914018341",
    "8903010825",
    "8903069878",
    "8907015696",
    "8905050964",
    "8914016977",
    "8912002971",
    "8908007450",
    "8002373090",
    "8918008841",
    "8000511127",
    "8600410045",
    "8901014084",
    "8909028781",
    "8250035925",
    "8002106691",
    "8904005118",
    "8002068558",
    "8001078301",
    "9006408188",
    "8912006451",
    "8902009176",
    "8903010651",
    "8001177794",
    "8909108712",
    "8604000838",
    "9006092963",
    "8909114603",
    "8600090563",
    "8919008490",
    "8600304398",
    "8902009517",
    "8200013598",
    "8600061876",
    "8919003174",
    "8920006251",
    "8002124338",
    "8904029071",
    "8920005656",
    "8913010187",
    "8919009261",
    "8600354795",
    "8909028726",
    "8000363944",
    "8600784277",
    "8908046142",
    "8002163829",
    "8305116257",
    "8001037905",
    "8910001595",
    "8920029601",
    "8918014501",
    "8905013638",
    "8002431010",
    "8000473522",
    "8909112607",
    "8190006358",
    "9006586331",
    "8002061242",
    "8002181735",
    "8908025460",
    "8002144448",
    "8902038386",
    "8900002163",
    "8600375255",
    "8000412559",
    "8320023951",
    "8909014301",
    "8903005031",
    "8600146293",
    "8911903223",
    "8002469708",
    "8110365499",
    "8909028916",
    "8908021790",
    "8909130022",
    "8916000434",
    "8909209903",
    "8909242380",
    "8000796190",
    "8002015117",
    "8904004428",
    "8080003504",
    "8002200647",
    "8907001896",
    "8002516276",
    "8000175846",
    "8000332444",
    "8000541937",
    "8001054164",
    "8001261478",
    "8001702347",
    "8002061281",
    "8002101760",
    "8002279373",
    "8002327954",
    "8020011478",
    "8070014401",
    "8110099426",
    "8110394638",
    "8140000099",
    "8200039976",
    "8600011834",
    "8600013712",
    "8600025666",
    "8600047631",
    "8600047661",
    "8600051081",
    "8600053133",
    "8600061195",
    "8600061511",
    "8600179428",
    "8600265502",
    "8600282030",
    "8600371102",
    "8600398653",
    "8600598680",
    "8600624403",
    "8900002131",
    "8900027210",
    "8901029991",
    "8901062485",
    "8902003161",
    "8902003335",
    "8902003351",
    "8902038426",
    "8903012964",
    "8903028491",
    "8904004356",
    "8904015707",
    "8905004663",
    "8909094599",
    "8909122515",
    "8909124496",
    "8909133080",
    "8909400786",
    "8911007721",
    "8911012827",
    "8912000359",
    "8912002878",
    "8912003084",
    "8912007030",
    "8912011960",
    "8912017873",
    "8912222731",
    "8913004415",
    "8913016677",
    "8914001480",
    "8914003559",
    "8914015345",
    "8914017477",
    "8914017753",
    "8914079306",
    "8914095169",
    "8918000622",
    "8919002026",
    "8919004251",
    "8919037091",
    "9000819417",
    "9000981502",
    "9002063123",
    "9004550387",
    "9006385155",
    "9009494287",
    "9010004019",
    "9011905232"
};

String[] ciudad = {
    "CARTAGENA Bolivar",
    "MAGANGUE Bolivar",
    "ARJONA Bolivar",
    "ARGELIA Valle del Cauca",
    "LA MESA Cundinamarca",
    "MEDELLIN Antioquia",
    "ARCABUCO Boyaca",
    "VALLEDUPAR Cesar",
    "RIOHACHA La Guajira",
    "SEVILLA Valle del Cauca",
    "RIOHACHA La Guajira",
    "FACATATIVA Cundinamarca",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "MANIZALES Caldas",
    "CHINCHINA Caldas",
    "ARMENIA Quindio",
    "BOGOTA Bogota D. C.",
    "CARTAGENA Bolivar",
    "BOGOTA Bogota D. C.",
    "RIONEGRO Antioquia",
    "COMBITA Boyaca",
    "SOGAMOSO Boyaca",
    "CHAPARRAL Tolima",
    "APARTADO Antioquia",
    "MEDELLIN Antioquia",
    "BOGOTA Bogota D. C.",
    "SIMIJACA Cundinamarca",
    "CALDAS Antioquia",
    "FACATATIVA Cundinamarca",
    "GRANADA Meta",
    "ARMENIA Quindio",
    "YOPAL Casanare",
    "CHACHAGUI Narino",
    "PEREIRA Risaralda",
    "PALMIRA Valle del Cauca",
    "ALCALA Valle del Cauca",
    "DUITAMA Boyaca",
    "BOSCONIA Cesar",
    "CURUMANI Cesar",
    "PUERRES Narino",
    "ORITO Putumayo",
    "SAN ONOFRE Sucre",
    "MARIA LA BAJA Bolivar",
    "CALARCA Quindio",
    "QUIMBAYA Quindio",
    "CALI Valle del Cauca",
    "FUNZA Cundinamarca",
    "ARMENIA Quindio",
    "NEIVA Huila",
    "FLORENCIA Caqueta",
    "POPAYAN Cauca",
    "AGUSTIN CODAZZI Cesar",
    "SORA Boyaca",
    "ALGARROBO Magdalena",
    "VILLA DE LEYVA Boyaca",
    "AMAGA Antioquia",
    "CONCORDIA Antioquia",
    "MEDELLIN Antioquia",
    "CERETE Cordoba",
    "TIMBIO Cauca",
    "SINCELEJO Sucre",
    "CALARCA Quindio",
    "MOMPOS Bolivar",
    "TRUJILLO Valle del Cauca",
    "TULUA Valle del Cauca",
    "MEDELLIN Antioquia",
    "TANGUA Narino",
    "PAMPLONA Norte de Santander",
    "SANTA ROSA DE CABAL Risaralda",
    "IBAGUE Tolima",
    "EL CERRITO Valle del Cauca",
    "SOACHA Cundinamarca",
    "VILLANUEVA Casanare",
    "CUCUTA Norte de Santander",
    "TAMESIS Antioquia",
    "LA DORADA Caldas",
    "TUNJA Boyaca",
    "PASTO Narino",
    "EL TAMBO Narino",
    "TUQUERRES Narino",
    "ABEJORRAL Antioquia",
    "CAICEDONIA Valle del Cauca",
    "CAJAMARCA Tolima",
    "MONTELIBANO Cordoba",
    "FUNDACION Magdalena",
    "VALLEDUPAR Cesar",
    "SOGAMOSO Boyaca",
    "VALLEDUPAR Cesar",
    "DUITAMA Boyaca",
    "SAN MARCOS Sucre",
    "CIUDAD BOLIVAR Antioquia",
    "CIRCASIA Quindio",
    "PEREIRA Risaralda",
    "VALLEDUPAR Cesar",
    "SARAVENA Arauca",
    "SOGAMOSO Boyaca",
    "GUARANDA Sucre",
    "ARMENIA Quindio",
    "GALAPA Atlantico",
    "GAMARRA Cesar",
    "GENOVA Quindio",
    "RIOHACHA La Guajira",
    "AGUACHICA Cesar",
    "LA JAGUA DE IBIRICO Cesar",
    "LIBANO Tolima",
    "MONTERIA Cordoba",
    "MONTENEGRO Quindio",
    "MANZANARES Caldas",
    "MARINILLA Antioquia",
    "TAMALAMEQUE Cesar",
    "PASTO Narino",
    "GUADALAJARA DE BUGA Valle del Cauca",
    "PASTO Narino",
    "ANGELOPOLIS Antioquia",
    "ROLDANILLO Valle del Cauca",
    "SABANALARGA Atlantico",
    "AGUAZUL Casanare",
    "ALBANIA La Guajira",
    "SANTA MARIA Huila",
    "ARMENIA Quindio",
    "SARAVENA Arauca",
    "ARAUCA Arauca",
    "GRANADA Meta",
    "LA GLORIA Cesar",
    "BELEN DE UMBRIA Risaralda",
    "DUITAMA Boyaca",
    "CAJICA Cundinamarca",
    "FLORENCIA Caqueta",
    "CAQUEZA Cundinamarca",
    "CUASPUD Narino",
    "CIENAGA Magdalena",
    "CASTILLA LA NUEVA Meta",
    "CHIRIGUANA Cesar",
    "CHINCHINA Caldas",
    "ARMENIA Quindio",
    "BUESACO Narino",
    "BOGOTA Bogota D. C.",
    "PESCA Boyaca",
    "COROZAL Sucre",
    "CORDOBA Narino",
    "COTA Cundinamarca",
    "YONDO Antioquia",
    "CUMBAL Narino",
    "DON MATIAS Antioquia",
    "SAN DIEGO Cesar",
    "SAN MIGUEL Putumayo",
    "EL DOVIO Valle del Cauca",
    "SEVILLA Valle del Cauca",
    "ANSERMA Caldas",
    "TUQUERRES Narino",
    "FLORENCIA Caqueta",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "FUENTE DE ORO Meta",
    "FUNZA Cundinamarca",
    "FUSAGASUGA Cundinamarca",
    "PALERMO Huila",
    "GARZON Huila",
    "GIGANTE Huila",
    "GIRARDOT Cundinamarca",
    "LA GLORIA Cesar",
    "GUACHUCAL Narino",
    "BARANOA Atlantico",
    "GUALMATAN Narino",
    "GUAMO Tolima",
    "SAN JOSE DEL GUAVIARE Guaviare",
    "OCANA Norte de Santander",
    "NEIVA Huila",
    "SANTA MARTA Magdalena",
    "ICONONZO Tolima",
    "ARMENIA Quindio",
    "ACACIAS Meta",
    "VALLEDUPAR Cesar",
    "SAN VICENTE DE CHUCURI Santander",
    "MARSELLA Risaralda",
    "PUERTO ASIS Putumayo",
    "MELGAR Tolima",
    "GRAMALOTE Norte de Santander",
    "SOACHA Cundinamarca",
    "VALLEDUPAR Cesar",
    "MANIZALES Caldas",
    "FRESNO Tolima",
    "SANTO TOMAS Atlantico",
    "OVEJAS Sucre",
    "BOGOTA Bogota D. C.",
    "PIJAO Quindio",
    "LA PLATA Huila",
    "RIOBLANCO Tolima",
    "RIOSUCIO Caldas",
    "BOGOTA Bogota D. C.",
    "ZIPAQUIRA Cundinamarca",
    "ARAUCA Arauca",
    "BOGOTA Bogota D. C.",
    "TIBACUY Cundinamarca",
    "TOCAIMA Cundinamarca",
    "ESPINAL Tolima",
    "SANTIAGO DE TOLU Sucre",
    "TURBACO Bolivar",
    "MONTERIA Cordoba",
    "OCANA Norte de Santander",
    "CIENAGA Magdalena",
    "CARTAGENA Bolivar",
    "MEDELLIN Antioquia",
    "SOCHA Boyaca",
    "PUEBLO NUEVO Cordoba",
    "SAMACA Boyaca",
    "SIBUNDOY Putumayo",
    "VILLANUEVA Bolivar",
    "ZIPAQUIRA Cundinamarca",
    "PAILITAS Cesar",
    "SANTA ROSA Bolivar",
    "PAZ DE ARIPORO Casanare",
    "LERIDA Tolima",
    "CHIGORODO Antioquia",
    "SAN LUIS Antioquia",
    "SAMPUES Sucre",
    "SAN JUAN DEL CESAR La Guajira",
    "SANTA ROSA Bolivar",
    "MEDELLIN Antioquia",
    "ANDES Antioquia",
    "QUIBDO Choco",
    "SARDINATA Norte de Santander",
    "SOCORRO Santander",
    "BETANIA Antioquia",
    "SINCE Sucre",
    "SINCELEJO Sucre",
    "GUAMAL Magdalena",
    "VALDIVIA Antioquia",
    "URRAO Antioquia",
    "RIOHACHA La Guajira",
    "YARUMAL Antioquia",
    "AGUA DE DIOS Cundinamarca",
    "LA VICTORIA Valle del Cauca",
    "BUCARAMANGA Santander",
    "VILLA DEL ROSARIO Norte de Santander",
    "BUCARAMANGA Santander",
    "SOATA Boyaca",
    "MAICAO La Guajira",
    "PAMPLONA Norte de Santander",
    "MALAGA Santander",
    "TIBU Norte de Santander",
    "SOACHA Cundinamarca",
    "BARBOSA Santander",
    "TAME Arauca",
    "LA MESA Cundinamarca",
    "SAN GIL Santander",
    "SOATA Boyaca",
    "MANIZALES Caldas",
    "AGUACHICA Cesar",
    "RIOHACHA La Guajira",
    "PASTO Narino",
    "RIOHACHA La Guajira",
    "BARRANQUILLA Atlantico",
    "SINCE Sucre",
    "TUNJA Boyaca",
    "MEDELLIN Antioquia",
    "BARRANQUILLA Atlantico",
    "CALI Valle del Cauca",
    "QUIBDO Choco",
    "BOGOTA Bogota D. C.",
    "FLORIDA Valle del Cauca",
    "FUSAGASUGA Cundinamarca",
    "ORTEGA Tolima",
    "IPIALES Narino",
    "ZIPAQUIRA Cundinamarca",
    "MANIZALES Caldas",
    "SOACHA Cundinamarca",
    "CALI Valle del Cauca",
    "SAN BERNARDO DEL VIENTO Cordoba",
    "CUCUTA Norte de Santander",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "RIONEGRO Antioquia",
    "EL CARMEN DE VIBORAL Antioquia",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "HONDA Tolima",
    "HONDA Tolima",
    "BOGOTA Bogota D. C.",
    "MANIZALES Caldas",
    "MEDELLIN Antioquia",
    "RIONEGRO Antioquia",
    "BOGOTA Bogota D. C.",
    "SOGAMOSO Boyaca",
    "BOGOTA Bogota D. C.",
    "ZIPAQUIRA Cundinamarca",
    "MANIZALES Caldas",
    "RIOHACHA La Guajira",
    "NEIVA Huila",
    "LA UNION Valle del Cauca",
    "BARRANQUILLA Atlantico",
    "CALI Valle del Cauca",
    "DOSQUEBRADAS Risaralda",
    "RAMIRIQUI Boyaca",
    "CALI Valle del Cauca",
    "MONTERIA Cordoba",
    "SANTA ROSA DE CABAL Risaralda",
    "BOGOTA Bogota D. C.",
    "CARTAGO Valle del Cauca",
    "RIOHACHA La Guajira",
    "BOGOTA Bogota D. C.",
    "CALI Valle del Cauca",
    "TAME Arauca",
    "RIOHACHA La Guajira",
    "CALI Valle del Cauca",
    "BOGOTA Bogota D. C.",
    "VILLAVICENCIO Meta",
    "RIONEGRO Antioquia",
    "MEDELLIN Antioquia",
    "BOGOTA Bogota D. C.",
    "POPAYAN Cauca",
    "IBAGUE Tolima",
    "CARTAGENA Bolivar",
    "LA DORADA Caldas",
    "BARRANQUILLA Atlantico",
    "SINCELEJO Sucre",
    "SABANETA Antioquia",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "POPAYAN Cauca",
    "MONTERIA Cordoba",
    "PUERTO TRIUNFO Antioquia",
    "APARTADO Antioquia",
    "GUARNE Antioquia",
    "BOGOTA Bogota D. C.",
    "SANTA ROSA DEL SUR Bolivar",
    "MEDELLIN Antioquia",
    "BOGOTA Bogota D. C.",
    "PALOCABILDO Tolima",
    "MEDELLIN Antioquia",
    "BARRANQUILLA Atlantico",
    "BOGOTA Bogota D. C.",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "COROZAL Sucre",
    "MEDELLIN Antioquia",
    "MANIZALES Caldas",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "YARUMAL Antioquia",
    "MANIZALES Caldas",
    "CARTAGO Valle del Cauca",
    "CALI Valle del Cauca",
    "MANIZALES Caldas",
    "VILLAVICENCIO Meta",
    "ARMENIA Quindio",
    "PUPIALES Narino",
    "POPAYAN Cauca",
    "GUACHUCAL Narino",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "MADRID Cundinamarca",
    "SANTANDER DE QUILICHAO Cauca",
    "CALI Valle del Cauca",
    "DUITAMA Boyaca",
    "TULUA Valle del Cauca",
    "CALI Valle del Cauca",
    "SUPIA Caldas",
    "TULUA Valle del Cauca",
    "CUCUTA Norte de Santander",
    "TRUJILLO Valle del Cauca",
    "GUADALAJARA DE BUGA Valle del Cauca",
    "TULUA Valle del Cauca",
    "TULUA Valle del Cauca",
    "TORO Valle del Cauca",
    "CARTAGO Valle del Cauca",
    "CALI Valle del Cauca",
    "CALI Valle del Cauca",
    "IBAGUE Tolima",
    "CUCUTA Norte de Santander",
    "LA VIRGINIA Risaralda",
    "PASTO Narino",
    "MANIZALES Caldas",
    "BARRANQUILLA Atlantico",
    "PUERTO BOYACA Boyaca",
    "COGUA Cundinamarca",
    "BOGOTA Bogota D. C.",
    "SOLEDAD Atlantico",
    "MEDELLIN Antioquia",
    "BARRANCAS La Guajira",
    "FACATATIVA Cundinamarca",
    "SINCELEJO Sucre",
    "TUTA Boyaca",
    "SIBUNDOY Putumayo",
    "MEDELLIN Antioquia",
    "PASTO Narino",
    "LEBRIJA Santander",
    "CALI Valle del Cauca",
    "TUQUERRES Narino",
    "MEDELLIN Antioquia",
    "BOGOTA Bogota D. C.",
    "LOS ANDES Narino",
    "MEDELLIN Antioquia",
    "BOGOTA Bogota D. C.",
    "TULUA Valle del Cauca",
    "FACATATIVA Cundinamarca",
    "PIEDECUESTA Santander",
    "RAMIRIQUI Boyaca",
    "ZIPAQUIRA Cundinamarca",
    "CARTAGO Valle del Cauca",
    "VILLAVICENCIO Meta",
    "CHOCONTA Cundinamarca",
    "MAGANGUE Bolivar",
    "VILLAVICENCIO Meta",
    "GUADALAJARA DE BUGA Valle del Cauca",
    "SEVILLA Valle del Cauca",
    "ZIPAQUIRA Cundinamarca",
    "MEDELLIN Antioquia",
    "MANIZALES Caldas",
    "GUASCA Cundinamarca",
    "MANIZALES Caldas",
    "BOGOTA Bogota D. C.",
    "RIOHACHA La Guajira",
    "IBAGUE Tolima",
    "MONTERIA Cordoba",
    "VILLAVICENCIO Meta",
    "TUNJA Boyaca",
    "CUCUTA Norte de Santander",
    "CUCUTA Norte de Santander",
    "CALDAS Antioquia",
    "MEDELLIN Antioquia",
    "SANTA MARTA Magdalena",
    "VALLEDUPAR Cesar",
    "BOGOTA Bogota D. C.",
    "CHIA Cundinamarca",
    "ANSERMA Caldas",
    "CHIQUINQUIRA Boyaca",
    "BUCARAMANGA Santander",
    "ARMENIA Quindio",
    "BOGOTA Bogota D. C.",
    "FUSAGASUGA Cundinamarca",
    "TOCANCIPA Cundinamarca",
    "LA CEJA Antioquia",
    "CALI Valle del Cauca",
    "CHIA Cundinamarca",
    "FLORENCIA Caqueta",
    "MONTELIBANO Cordoba",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "VITERBO Caldas",
    "MEDELLIN Antioquia",
    "QUIBDO Choco",
    "SABANETA Antioquia",
    "MEDELLIN Antioquia",
    "VALLE DEL GUAMUEZ Putumayo",
    "MELGAR Tolima",
    "CARTAGENA Bolivar",
    "SILVANIA Cundinamarca",
    "SANTANDER DE QUILICHAO Cauca",
    "IBAGUE Tolima",
    "YARUMAL Antioquia",
    "BOGOTA Bogota D. C.",
    "PUERTO GUZMAN Putumayo",
    "MEDELLIN Antioquia",
    "SAN ANTONIO DEL TEQUEND Cundinamarca",
    "CHIQUINQUIRA Boyaca",
    "BOGOTA Bogota D. C.",
    "ZIPAQUIRA Cundinamarca",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "CHIQUINQUIRA Boyaca",
    "POLONUEVO Atlantico",
    "SALAZAR Norte de Santander",
    "MEDELLIN Antioquia",
    "LA PINTADA Antioquia",
    "PASTO Narino",
    "DUITAMA Boyaca",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "BOGOTA Bogota D. C.",
    "CHIA Cundinamarca",
    "FACATATIVA Cundinamarca",
    "BOGOTA Bogota D. C.",
    "CHIA Cundinamarca",
    "BOGOTA Bogota D. C.",
    "SIBATE Cundinamarca",
    "BOGOTA Bogota D. C.",
    "ARMENIA Quindio",
    "ARMENIA Quindio",
    "BARRANQUILLA Atlantico",
    "PUERTO COLOMBIA Atlantico",
    "BUCARAMANGA Santander",
    "BUCARAMANGA Santander",
    "BUCARAMANGA Santander",
    "BUCARAMANGA Santander",
    "CALI Valle del Cauca",
    "CALI Valle del Cauca",
    "CARTAGENA Bolivar",
    "CARTAGENA Bolivar",
    "CUCUTA Norte de Santander",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "GUATAPE Antioquia",
    "MEDELLIN Antioquia",
    "MEDELLIN Antioquia",
    "NEIVA Huila",
    "PITALITO Huila",
    "PASTO Narino",
    "IPIALES Narino",
    "PASTO Narino",
    "IPIALES Narino",
    "PASTO Narino",
    "IPIALES Narino",
    "PASTO Narino",
    "GINEBRA Valle del Cauca",
    "PALMIRA Valle del Cauca",
    "PEREIRA Risaralda",
    "PEREIRA Risaralda",
    "QUINCHIA Risaralda",
    "SANTUARIO Risaralda",
    "PEREIRA Risaralda",
    "APIA Risaralda",
    "PEREIRA Risaralda",
    "BOGOTA Bogota D. C.",
    "CARTAGO Valle del Cauca",
    "VERSALLES Valle del Cauca",
    "GUADALAJARA DE BUGA Valle del Cauca",
    "ZIPAQUIRA Cundinamarca",
    "BARRANQUILLA Atlantico",
    "BOGOTA Bogota D. C.",
    "EL CERRITO Valle del Cauca",
    "CALI Valle del Cauca",
    "CUCUTA Norte de Santander",
    "CUCUTA Norte de Santander",
    "FUSAGASUGA Cundinamarca",
};

 public static List<TerminalTransporte> obtenerTerminalesTransporte() {
        List<TerminalTransporte> terminales = new ArrayList<>();

            terminales.add(new TerminalTransporte(  "1 ",  "AGUACHICA ",  "CR. 12 No.7-62 ",  "o976-651370-651408 ",  "YOLY CECILIA PEREZ ESPINOSA ", "O20 " ));
            terminales.add(new TerminalTransporte(  "2 ",  "ARMENIA ",  "cl. 35 No. 20-68 ",  "O967-472406-473365 ",  "JUAN JOSE ORREGO LOPEZ ", "O35 " ));
            terminales.add(new TerminalTransporte(  "3 ",  "BARRANQUILLA ",  "km. 1.5 prolong. Calle murillo piso 2 ",  "O953-432220-431964 ",  "JORGE VERA KIDD ", "O53 " ));
            terminales.add(new TerminalTransporte(  "4 ",  "BOGOTA ",  "trasv. 66 nOP. 35-04 of 502 ",  "4163155-2951100 ",  "JOSE DAVID MARIN ENRIQUEZ ", "O49 " ));
            terminales.add(new TerminalTransporte(  "5 ",  "BUCARAMANGA ",  "tv. Central metropolitana ",  "O976445572-445616 ",  "FELIX FRANCISCO RUEDA ", "O43 " ));
            terminales.add(new TerminalTransporte(  "6 ",  "CALI ",  "cl 30 norte 2aN-29 piso 2 ",  "0926683655-673761 ",  "JORGE VASQUEZ ROMERO ", "O33 " ));
            terminales.add(new TerminalTransporte(  "7 ",  "CARTAGENA ",  "ctera cordialidad dg 57 No. 54-236 ",  "0956-630454-630289 ",  "FRANKLIN MORDECAI ", "------ " ));
            terminales.add(new TerminalTransporte(  "8 ",  "GIRARDOT ",  "cl 25 No. 12-56 ",  "09183-31141-33721 ",  "HEBERT ACOSTA BOCANEGRA ", "O37 " ));
            terminales.add(new TerminalTransporte(  "9 ",  "IBAGUE ",  "cr 2 No. 20-86 of 203 ",  "0982-637002-611724 ",  "FRANCISCO CASTRO PACHECO ", "O50 " ));
            terminales.add(new TerminalTransporte(  "10 ",  "IPIALES ",  "cl 8 No. 4-48 (en construccion) ",  "09725-2003-2304 ",  "JAVIER PEREZ PINEDA ", "------ " ));
            terminales.add(new TerminalTransporte(  "11 ",  "MANIZALES ",  "av. 19 No.15-04 piso 3 ",  "0968-849331-849183 ",  "PEDRO CLAVER GONZALEZ CORRALES ", "O47 " ));
            terminales.add(new TerminalTransporte(  "12 ",  "MEDELLIN ",  "Cr 64 c No. 78-344 ",  "094-2677075-2677076 ",  "FRANSCISCO JAVIER SALDARRIAGA ", "O39 " ));
            terminales.add(new TerminalTransporte(  "13 ",  "NEIVA ",  "Cr 7 No. 3A-76 sur ",  "0988-731233705361 ",  "OMAR ERWIN ARIZA RAMIREZ ", "----- " ));
            terminales.add(new TerminalTransporte(  "14 ",  "PASTO ",  "Cr 6 No. 16D-50 Admon ",  "0927-308955-309199 ",  "FELIPE GUZMAN MURIEL ", "O28 " ));
            terminales.add(new TerminalTransporte(  "15 ",  "PEREIRA ",  "Cl 17 No. 23-157 ",  "0963-215846-212338 ",  "CARLOS ALBERTO HERNANDEZ ", "O48 " ));
            terminales.add(new TerminalTransporte(  "16 ",  "POPAYAN ",  "Tv. 9 No. 4N-125 ",  "0928-231817- 234995 ",  "JUAN JOSE VIVAS FERNANDEZ ", "O34 " ));
            terminales.add(new TerminalTransporte(  "17 ",  "SAN GIL ",  "Ctera salida BOGOTA ",  "097724-5858-5959 ",  "ANTONIO LOPEZ BAYONA ", "O44 " ));
            terminales.add(new TerminalTransporte(  "18 ",  "SANTA MARTA ",  "variante Gaira Mamatoco cl 41 No.31-17 ",  "0954-302040 ",  "MIRNA JACOBS VIZCAINO ", "O51 " ));
            terminales.add(new TerminalTransporte(  "19 ",  "SOGAMOSO ",  "Cr 17 Cl 11 y 11A ",  "0987-703302-703300 ",  "JORGE E. AVELLA JIMENEZ ", "O38 " ));
            terminales.add(new TerminalTransporte(  "20 ",  "VILLAVICENCIO ",  "Cr 1 No. 15-02 anillo vial ",  "0986665522-655524 ",  "JHON FREDY PARDO PARDO ", "O15 " ));


        // Agrega más elementos de la misma forma si es necesario

        return terminales;
    }

    
    public static List<CompaniaTransporte> obtenerCompaniasTransporte() {
        List<CompaniaTransporte> companias = new ArrayList<>();
        companias.add(new CompaniaTransporte( "8000684552", "COOP INTEGRAL DE TRANSPORTE DE CARTAGENA LTDA. COOINTRACAR", "COOINTRACAR LTDA", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "890480666", "COOPERATIVA INTEGRAL DE TRANSPORTE DE MAGANGUE LTDA", "COOTRAIMAG LTDA", "Bolivar", "MAGANGUE" ));
        companias.add(new CompaniaTransporte( "8904812847", "COOPERATIVA DE TRANSPORTE DE ARJONA ", "COOTRANSAR LTDA", "Bolivar", "ARJONA" ));
        companias.add(new CompaniaTransporte( "8919010070", "COOPERATIVA DE TRANSPORTADORES MOTORISTAS DE ARGELIA LTDA.", "COOTRANSMOTAR", "Valle del Cauca", "ARGELIA" ));
        companias.add(new CompaniaTransporte( "8080007689", "CIA DE TRANSPORTES LA PROVINCIA SA", "CIA DE TRANSPORTES LA PROVINCIA SA", "Cundinamarca", "LA MESA" ));
        companias.add(new CompaniaTransporte( "8909289702", "AEROTAXI S.A.", "AEROTAXI S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8002324286", "COOPERATIVA DE TRANSPORTADORES DE ARCABUCO ", "ARCOTRANS", "Boyaca", "ARCABUCO" ));
        companias.add(new CompaniaTransporte( "9002931253", "ASOCIACION TRANSPORCOL", "ASOCIACION TRANSPORCOL", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "9000273537", "ASOCIACION TRANSPORTADORA DEL NORTE Y SUR DE LA GUAJIRA", "ASOTRANOSUR", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8919012274", "ASOCIACION DE TRANSPORTADORES DE SEVILLA S.A.", "ASOTRANSE S.A.", "Valle del Cauca", "SEVILLA" ));
        companias.add(new CompaniaTransporte( "8240065427", "AUTO EXPRESS", "AUTO EXPRESS", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8600093550", "AUTO FACA S.A.", "AUTO FACA S.A.", "Cundinamarca", "FACATATIVA" ));
        companias.add(new CompaniaTransporte( "8906000201", "AUTO FUSA S.A.", "AUTO FUSA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "890600427", "AUTO LINEAS LAS ACACIAS LTDA", "AUTO LINEAS LAS ACACIAS LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8908000629", "AUTOLEGAL S.A", "AUTOLEGAL S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8908022061", "EMPRESA DE TRANSPORTES AUTOLUJO S A", "AUTOLUJO S.A.", "Caldas", "CHINCHINA" ));
        companias.add(new CompaniaTransporte( "8900000593", "BUSES ARMENIA S. A.", "BASA", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8600156241", "TRANSPORTES Y TURISMO BERLINAS DEL FONCE S.A.", "BERLINASTUR S.A. ", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8060123641", "BUSEXPRESS LIMITADA", "BUSEXPRESS LTDA ", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8001024074", "CARROS DEL SUR TRANSPORTES S.A. ", "CARDELSSA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8909032294", "TRANSPORTES CHACHAFRUTO S.A.", "CHACHAFRUTO", "Antioquia", "RIONEGRO" ));
        companias.add(new CompaniaTransporte( "8001904632", "COOPERATIVA INTEGRAL TRANSPORTADORES COMBITA LTDA.", "CITRACOM LTDA", "Boyaca", "COMBITA" ));
        companias.add(new CompaniaTransporte( "8918000457", "COOPERATIVA DE TRANSPORTADORES FLOTA NORTE LTDA", "COFLONORTE", "Boyaca", "SOGAMOSO" ));
        companias.add(new CompaniaTransporte( "8907005985", "COOPERATIVA DE TRANSPORTADORES COINTRASUR LTDA", "COINTRASUR LTDA.", "Tolima", "CHAPARRAL" ));
        companias.add(new CompaniaTransporte( "8001241961", "COOINTUR - COOPERATIVA INTEGRAL DE TRANSPORTADORES DE URABA", "COINTUR", "Antioquia", "APARTADO" ));
        companias.add(new CompaniaTransporte( "8909203975", "COMBUSES - COMPANIA METROPOLITANA DE BUSES S.A", "COMBUSES", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8600077017", "COMPAÑIA DE TAXIS VERDES S. A.", "COMPANIA DE TAXIS VERDES S. A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8001742069", "COOPERATIVA MULTIACTIVA DE TRANSPORTADORES DE SIMIJACA LTDA.", "COMULTRASIM LTDA. ", "Cundinamarca", "SIMIJACA" ));
        companias.add(new CompaniaTransporte( "8909045981", "CONDUCCIONES LAS ARRIERITAS S.A.", "CONDUCCIONES LAS ARRIERITAS S.A.", "Antioquia", "CALDAS" ));
        companias.add(new CompaniaTransporte( "8001642826", "COOPERATIVA DEL GREMIO DE CONDUCTORES DE CUNDINAMARCA LTDA", "CONDUCOOP", "Cundinamarca", "FACATATIVA" ));
        companias.add(new CompaniaTransporte( "8001464921", "COOPERATIVA DE TRANSPORTADORES CON AUTOMOTORES DEL ARIARI", "COOAUTOARIARI", "Meta", "GRANADA" ));
        companias.add(new CompaniaTransporte( "8900000862", "COOPERATIVA DE BUSES URBANOS DEL QUINDIO", "COOBURQUIN ", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8918555343", "COOPERATIVA CASANARENA DE TRANSPORTADORES LTDA", "COOCATRANS", "Casanare", "YOPAL" ));
        companias.add(new CompaniaTransporte( "8140002855", "COOP TRANSP Y TURISMO CHACHAGUI LTDA", "COOCHACHAGUI LTDA", "Narino", "CHACHAGUI" ));
        companias.add(new CompaniaTransporte( "8914000894", "COOPERATIVA MULTIACTIVA DE CHOFERES DE PEREIRA ", "COOCHOFERES PEREIRA", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "8913000594", "COOPERATIVA DE TRANSPORTADORES DE PALMIRA LTDA.", "COODETRANS PALMIRA LTDA", "Valle del Cauca", "PALMIRA" ));
        companias.add(new CompaniaTransporte( "8919010049", "COOPERATIVA ESPECIALIZADA DE TRANSPORTE DE ALCALA LIMITADA", "COOETRANSALCA", "Valle del Cauca", "ALCALA" ));
        companias.add(new CompaniaTransporte( "8918000432", "COOPERATIVA DE TRANSPORTADORES FLOTAX DUITAMA", "COOFLOTAX", "Boyaca", "DUITAMA" ));
        companias.add(new CompaniaTransporte( "8240000292", "COOPERATIVA INTEGRAL DE TRANSPORTADORES DE BOSCONIA ", "COOINTRABOS LTDA", "Cesar", "BOSCONIA" ));
        companias.add(new CompaniaTransporte( "8002311628", "COOP INTEGRAL DE TRANSPORTADORES DE CURUMANI ", "COOINTRACUR LTDA", "Cesar", "CURUMANI" ));
        companias.add(new CompaniaTransporte( "8140009497", "COOPERATIVA INTEGRAL DE TRANSPORTADORES OCEANICA LTDA", "COOINTRANSOCEANICA LTDA", "Narino", "PUERRES" ));
        companias.add(new CompaniaTransporte( "8002256323", "COOPERATIVA INTEGRAL DE TRANSPORTES Y VIAS LTDA", "COOINTRANSVIAS LTDA", "Putumayo", "ORITO" ));
        companias.add(new CompaniaTransporte( "8002119445", "COOPERATIVA DE TRANSPORTADORES DE SAN ONOFRE", "COOINTRASAN LTDA", "Sucre", "SAN ONOFRE" ));
        companias.add(new CompaniaTransporte( "800206977", "COOPERATIVA INTEGRAL DE TRANSPORTE DE MARIA LA BAJA", "COOINTRASMAR", "Bolivar", "MARIA LA BAJA" ));
        companias.add(new CompaniaTransporte( "8000839531", "COOPERATIVA DE MOTORISTAS DE CALARCA ", "COOMOCAL ", "Quindio", "CALARCA" ));
        companias.add(new CompaniaTransporte( "8900004969", "COOPERATIVA DE MOTORISTAS DE QUIMBAYA LTDA.", "COOMODEQUI LTDA.", "Quindio", "QUIMBAYA" ));
        companias.add(new CompaniaTransporte( "8903030817", "COOPERATIVA ESPECIALIZADA DE TRANSPORTES COOMOEPAL", "COOMOEPAL", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8605173915", "COOPERATIVA DE MOTORISTAS DE MOSQUERA Y FUNZA", "COOMOFU LTDA", "Cundinamarca", "FUNZA" ));
        companias.add(new CompaniaTransporte( "8900000902", "COOPERATIVA DE MOTORISTAS DEL QUINDIO ", "COOMOQUIN", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8911002791", "COOPERATIVA DE MOTORISTAS DEL HUILA Y CAQUETA", "COOMOTOR LTDA", "Huila", "NEIVA" ));
        companias.add(new CompaniaTransporte( "8911005565", "COOPERATIVA DE MOTORISTAS DE FLORENCIA LIMITADA", "COOMOTORFLORENCIA", "Caqueta", "FLORENCIA" ));
        companias.add(new CompaniaTransporte( "8915000451", "COOPERATIVA DE MOTORISTAS DEL CAUCA", "COOMOTORISTAS", "Cauca", "POPAYAN" ));
        companias.add(new CompaniaTransporte( "8002099692", "COOPERATIVA MULTIACTIVA DE CODAZZI", "COOMULCOD", "Cesar", "AGUSTIN CODAZZI" ));
        companias.add(new CompaniaTransporte( "8918012092", "COOPERATIVA MULTIACTIVA DE SORA LTDA.", "COOMULSORA", "Boyaca", "SORA" ));
        companias.add(new CompaniaTransporte( "8190000746", "COOP. MULTIACTIVA DE TRANS. DE ALGARROBO", "COOMULTRAL LTDA", "Magdalena", "ALGARROBO" ));
        companias.add(new CompaniaTransporte( "8001585231", "COOPERATIVA DE TRANSPORTADORES DE VILLA DE LEYVA", "COOMULTRANSVILLA", "Boyaca", "VILLA DE LEYVA" ));
        companias.add(new CompaniaTransporte( "8909103481", "COOMUTRAN - COOP. MULTIACTIVA DE TRANSPORTES DE ANTIOQUIA ", "COOMUTRAN ", "Antioquia", "AMAGA" ));
        companias.add(new CompaniaTransporte( "8110023909", "COONCOR - COOPERATIVA DE TRANSPORTADORES DE CONCORDIA", "COONCOR", "Antioquia", "CONCORDIA" ));
        companias.add(new CompaniaTransporte( "8909056802", "COONORTE - COOPERATIVA NORTENA DE TRANSPORTADORES LTDA", "COONORTE ", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8910010093", "COOPERATIVA ESPECIALIZADA DE TRANSPORTADORES ORO BLANCO LTD", "COOP. ORO BLANCO LTDA.", "Cordoba", "CERETE" ));
        companias.add(new CompaniaTransporte( "8915005934", "COOPERATIVA TRANSPORTADORA DE TIMBIO", "COOP. TRANSP. DE TIMBIO", "Cauca", "TIMBIO" ));
        companias.add(new CompaniaTransporte( "8904005655", "COOPERATIVA ESPECIALIZADA DE TRANSPORTADORES TORCOROMA", "COOP. TROCOROMA LTDA.", "Sucre", "SINCELEJO" ));
        companias.add(new CompaniaTransporte( "8900002686", "COOPERATIVA DE MOTORISTAS EL CACIQUE DE CALARCA ", "COOPCACIQUE ", "Quindio", "CALARCA" ));
        companias.add(new CompaniaTransporte( "8904031008", "COOPERATIVA ESPECIALIZADA DE TRANSPORTADORES DE MOMPOS LTDA", "COOPESTRAM LTDA.", "Bolivar", "MOMPOS" ));
        companias.add(new CompaniaTransporte( "8919018470", "COOPERATIVA DE TRANSP DE TRUJILLO LTDA", "COOPETRANS TRUJILLO LTDA", "Valle del Cauca", "TRUJILLO" ));
        companias.add(new CompaniaTransporte( "8919002549", "COOPERATIVA DE TRANSPORTADORES DE TULUA LTDA", "COOPETRANS TULUA LTDA", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8909083747", "COOPETRANSA - COOP. DE TRADORES SANTA ROSA - 7", "COOPETRANSA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8140009813", "COOPERATIVA EXPRESO TANGUA COOPEXTAN", "COOPEXTAN", "Narino", "TANGUA" ));
        companias.add(new CompaniaTransporte( "8001520281", "COOPERATIVA DE TRANSPORTADORES EL MOTILON", "COOPMOTILON LTDA", "Norte de Santander", "PAMPLONA" ));
        companias.add(new CompaniaTransporte( "8001791443", "COOPERATIVA DE PROFESIONALES DE RISARALDA-COOPRISAR", "COOPRISAR", "Risaralda", "SANTA ROSA DE CABAL" ));
        companias.add(new CompaniaTransporte( "8907035506", "COOP DE PROPIETARIOS DE TAXIS DEL SERV URB DE IBAGUE LTDA", "COOPROTAXI", "Tolima", "IBAGUE" ));
        companias.add(new CompaniaTransporte( "8913003915", "COOPERATIVA PROYECCION", "COOPROYECCION", "Valle del Cauca", "EL CERRITO" ));
        companias.add(new CompaniaTransporte( "8001682634", "COOPERATIVA MULTIACTIVA DE TRANSPORTADORES DE SAN MATEO", "COOPTRANSANMATEO ", "Cundinamarca", "SOACHA" ));
        companias.add(new CompaniaTransporte( "8002158871", "COOP. MULTIAC.DE TRANSPORTAD. MARGINAL DEL LLANO", "COOPTRANSMARGINAL", "Casanare", "VILLANUEVA" ));
        companias.add(new CompaniaTransporte( "9000381561", "COOPERATIVA DE TRANSPORTADORES DEL ORIENTE", "COOPTRANSORIENTE", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8001169567", "COOPTRATAM - COOPERATIVA DE TRANSPORTADORES DE TAMESIS", "COOPTRATAM", "Antioquia", "TAMESIS" ));
        companias.add(new CompaniaTransporte( "8908003014", "COOP INTEGRAL DE TRANSPORTADORES FLOTA LOS PUERTOS LTDA", "COOPUERTOS LTDA", "Caldas", "LA DORADA" ));
        companias.add(new CompaniaTransporte( "8918005891", "COOPERATIVA DE TRANSPORTADORES COOTAX TUNJA", "COOTAX TUNJA", "Boyaca", "TUNJA" ));
        companias.add(new CompaniaTransporte( "8912016234", "COOP TRANSPORTADORES TAX LUJO LTDA", "COOTAXLUJO LTDA", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8140016236", "COOPERATIVA DE TAXIS DE EL TAMBO LIMITADA", "COOTAXTAMBO LTDA.", "Narino", "EL TAMBO" ));
        companias.add(new CompaniaTransporte( "8912014134", "COOPERATIVA MULTIACTIVA DE TAXISTAS DE TUQUERRES LTDA.", "COOTAXTUQUERRES LTDA", "Narino", "TUQUERRES" ));
        companias.add(new CompaniaTransporte( "8001407934", "COOTRABE -COOP. MULTIACTIVA TRABAJO ASOCIADO TRADRES. ABEJORRA", "COOTRABE", "Antioquia", "ABEJORRAL" ));
        companias.add(new CompaniaTransporte( "8919003927", "COOPERATIVA DE TRANSPORTADORES DE CAICEDONIA LIMITADA", "COOTRACAICE", "Valle del Cauca", "CAICEDONIA" ));
        companias.add(new CompaniaTransporte( "8907006779", "COOPERATIVA DE TRANSPORTADORES DE CAJAMARCA Y ANAIME LTDA", "COOTRACAIME LTDA.", "Tolima", "CAJAMARCA" ));
        companias.add(new CompaniaTransporte( "8120024427", "COOPERATIVA DE TRANSPORTADORES DE MONTELIBANO", "COOTRACAM", "Cordoba", "MONTELIBANO" ));
        companias.add(new CompaniaTransporte( "8917005918", "COOP. DE TRANSP DE CARRETERAS NACIONALES", "COOTRACAR", "Magdalena", "FUNDACION" ));
        companias.add(new CompaniaTransporte( "8923003657", "COOPERATIVA DE TRANSPORTADORES DEL CESAR Y LA GUAJIRA ", "COOTRACEGUA LTDA", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8918552578", "COOP. DE TRANSPORTADORES CIUDAD DEL ACERO LTDA", "COOTRACERO LTDA", "Boyaca", "SOGAMOSO" ));
        companias.add(new CompaniaTransporte( "8000993374", "COOPERATIVA DE TRANSPORTES DEL CESAR LTDA", "COOTRACESAR LTDA", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8918000441", "COOP. DE TRANSPORTADORES RAPIDO CHICAMOCHA LTDA", "COOTRACHICA", "Boyaca", "DUITAMA" ));
        companias.add(new CompaniaTransporte( "8230021605", "COOPERATIVA DE TRANSPORTADORES CHIPILIN", "COOTRACHIPILIN", "Sucre", "SAN MARCOS" ));
        companias.add(new CompaniaTransporte( "8000483691", "COOTRACIBOL - COOP. DE TRDORES DE CIUDAD BOLIVAR", "COOTRACIBOL", "Antioquia", "CIUDAD BOLIVAR" ));
        companias.add(new CompaniaTransporte( "8900014671", "COOPERATIVA INTEGRAL DE TRANSPORTADORES DE CIRCASIA .", "COOTRACIR", "Quindio", "CIRCASIA" ));
        companias.add(new CompaniaTransporte( "8001852976", "COOP DE TRANSPORTES COLECTIVOS DEL CAFE LTDA-COOTRACOL LTDA", "COOTRACOL", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "9010873505", "TRANSPORTES COTRACOSTA S.A.S.", "COOTRACOSTA S.A.S.", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8001959675", "COOP DE TRANSPORTE DEL SARARE LIMITADA COOTRADELSA LTDA", "COOTRADELSA LTDA", "Arauca", "SARAVENA" ));
        companias.add(new CompaniaTransporte( "8918553250", "COOPERATIVA DE TRANSPORTADORES DEL SOL LTDA", "COOTRADELSOL LTDA", "Boyaca", "SOGAMOSO" ));
        companias.add(new CompaniaTransporte( "8922009324", "COOPERATIVA MULTIACTIVA DE TRANSPORTE TERRESTRE, FLUVIAL Y AGROPI ", "COOTRAFLUVSUC", "Sucre", "GUARANDA" ));
        companias.add(new CompaniaTransporte( "8900027045", "COOPERATIVA DE TRANSPORTADORES LOS FUNDADORES ", "COOTRAFUN", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8901101737", "COOPERATIVA DE TRANSPORTADORES DE GALAPA ", "COOTRAGAL", "Atlantico", "GALAPA" ));
        companias.add(new CompaniaTransporte( "8923001905", "COOP DE TRANSPORTADORES DE GAMARRA LTDA COOTRAGAM", "COOTRAGAM LTDA", "Cesar", "GAMARRA" ));
        companias.add(new CompaniaTransporte( "8900030841", "COOPERATIVA DE TRANSPORTADORES DE GENOVA LTDA", "COOTRAGEN LTDA", "Quindio", "GENOVA" ));
        companias.add(new CompaniaTransporte( "8921152584", "COOPERATIVA DE TRANSPORTADORES DE LA GUAJIRA", "COOTRAGUA", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8923004204", "COOP DE TRANSPORTADORES DE AGUACHICA LTDA", "COOTRAGUA LTDA", "Cesar", "AGUACHICA" ));
        companias.add(new CompaniaTransporte( "8240021694", "COOPERATIVA DE TRANSPORTE DE LA JAGUA DE IBIRICO", "COOTRAIBIRICO", "Cesar", "LA JAGUA DE IBIRICO" ));
        companias.add(new CompaniaTransporte( "8907051978", "COOP DE TRANSPORTADORES DEL LIBANO LTDA COOTRALIBANO LTDA", "COOTRALIBANO LTDA", "Tolima", "LIBANO" ));
        companias.add(new CompaniaTransporte( "8002436566", "COOPERATIVA DE TRANSPORTADORES DEL ALTO SINU LTDA.", "COOTRALSINU LTDA.", "Cordoba", "MONTERIA" ));
        companias.add(new CompaniaTransporte( "8900017549", "COOPERATIVA DE TRANSPORTADORES DE MONTENEGRO ", "COOTRAM ", "Quindio", "MONTENEGRO" ));
        companias.add(new CompaniaTransporte( "8908026698", "COOPERATIVA TRANSPORTADORES DE MANZANARES LTDA", "COOTRAMAN LTDA", "Caldas", "MANZANARES" ));
        companias.add(new CompaniaTransporte( "8002516900", "COOTRAMARINI - COOPERATIVA DE TRANSPORTES DE MARINILLA", "COOTRAMARINI", "Antioquia", "MARINILLA" ));
        companias.add(new CompaniaTransporte( "8240019459", "COOPERATIVA MULTIACTIVA DE TRANPORTADORES DE TAMALAMEQUE", "COOTRAMEQUE", "Cesar", "TAMALAMEQUE" ));
        companias.add(new CompaniaTransporte( "8912002807", "COOPERATIVA INTEGRAL DE TRANSPORTADORES DE NARINO LTDA", "COOTRANAR LTDA", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8913007330", "COOPERATIVA DE TRANSPORTADORES CIUDAD SRA LTDA COOTRANCISE", "COOTRANCISE", "Valle del Cauca", "GUADALAJARA DE BUGA" ));
        companias.add(new CompaniaTransporte( "8000940804", "COOPERATIVA DE TRANSPORTADORES LOS ANDES LTDA", "COOTRANDES LTDA", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8110098736", "COOTRANGEL - COOPERATIVA DE TRANSPORTES DE ANGELOPOLIS", "COOTRANGEL", "Antioquia", "ANGELOPOLIS" ));
        companias.add(new CompaniaTransporte( "8919003128", "COOPERATIVA DE TRANSPORTADORES DE OCCIDENTE LTDA", "COOTRANS DE OCCIDENTE", "Valle del Cauca", "ROLDANILLO" ));
        companias.add(new CompaniaTransporte( "8901049215", "COOPERATIVA DE TRANSPORTADORES DE SABANALARGA LTDA COOTRANS", "COOTRANSA", "Atlantico", "SABANALARGA" ));
        companias.add(new CompaniaTransporte( "8002516212", "COOPERATIVA DE TRANSPORTADORES DE AGUAZUL LTDA. ", "COOTRANSAGUAZUL", "Casanare", "AGUAZUL" ));
        companias.add(new CompaniaTransporte( "901351446", "COOPERATIVA MULTIACTIVA DE TRANSPORTADORES DE ALBANIA", "COOTRANSALBANIA", "La Guajira", "ALBANIA" ));
        companias.add(new CompaniaTransporte( "8001803251", "COOPERATIVA DE TRANSPORTADORES DE SANTA MARIA LIMITADA", "COOTRANSAMARIA LTDA", "Huila", "SANTA MARIA" ));
        companias.add(new CompaniaTransporte( "8000053357", "COOPERATIVA DE TRANSPORTADORES SAN FRANCISCO ARMENIA", "COOTRANSANF ", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8905041452", "COOPERATIVA DE TRANSPORTADORES DEL SARARE LTDA", "COOTRANSARARE LTDA", "Arauca", "SARAVENA" ));
        companias.add(new CompaniaTransporte( "8820114706", "COOPERATIVA ARAUCANA DE TRANSPORTADORES", "COOTRANSARAUCANA LTDA", "Arauca", "ARAUCA" ));
        companias.add(new CompaniaTransporte( "8000943389", "COOPERATIVA DE TRANSPORTADORES DEL ARIARI", "COOTRANSARIARI ", "Meta", "GRANADA" ));
        companias.add(new CompaniaTransporte( "8240037381", "COOPERATIVA DE TRANSPORTADORES DE AYACUCHO Y SIMAÑA", "COOTRANS-AYASI", "Cesar", "LA GLORIA" ));
        companias.add(new CompaniaTransporte( "8914016991", "COOPERATIVA DE TRANSPORTADORES DE BELEN DE UMBRIA LTDA", "COOTRANSBEL", "Risaralda", "BELEN DE UMBRIA" ));
        companias.add(new CompaniaTransporte( "8001741569", "COOP.ESPECIALIZ.DE TRANSPORTADORES SIMON BOLIVAR LTDA", "COOTRANSBOL LTDA", "Boyaca", "DUITAMA" ));
        companias.add(new CompaniaTransporte( "8000974262", "NUEVA COOPERATIVA DE TRANSPORTADORES DE CAJICA LTDA", "COOTRANSCAJICA", "Cundinamarca", "CAJICA" ));
        companias.add(new CompaniaTransporte( "8911003551", "COOPERATIVA DE TRANSPORTADORES DEL CAQUETA Y HUILA LTDA", "COOTRANSCAQUETA LTDA", "Caqueta", "FLORENCIA" ));
        companias.add(new CompaniaTransporte( "8000736874", "COOPERATIVA DE TRANSPORTADORES DE CAQUEZA LTDA", "COOTRANSCAQUEZA LTDA", "Cundinamarca", "CAQUEZA" ));
        companias.add(new CompaniaTransporte( "8912244427", "COOPERATIVA DE TRANSPORTADORES DE CARLOSAMA LTDA", "COOTRANSCAR", "Narino", "CUASPUD" ));
        companias.add(new CompaniaTransporte( "8917010216", "COOPERATIVA DE TRANSPORTADORES DEL CARIBE LTDA", "COOTRANSCARIBE LTDA", "Magdalena", "CIENAGA" ));
        companias.add(new CompaniaTransporte( "8001935801", "COOTRANSCASTILLA LTDA", "COOTRANSCASTILLA LTDA.", "Meta", "CASTILLA LA NUEVA" ));
        companias.add(new CompaniaTransporte( "8002414791", "COOPERATIVA MULTIACTIVA DE TRANSPORTES DE CHIRIGUANA LTDA", "COOTRANSCHI LTDA", "Cesar", "CHIRIGUANA" ));
        companias.add(new CompaniaTransporte( "8908023869", "COOPERATIVA DE TRANSPORTADORES DE CHINCHINA", "COOTRANSCHINCHINA", "Caldas", "CHINCHINA" ));
        companias.add(new CompaniaTransporte( "8900028580", "COOPERATIVA DE TRANSPORTADORES EL CENTENARIO DE ARMENIA", "COOTRANSCIEN ", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8000949206", "COOPERATIVA DE TRANSPORTES RUTAS DE COLOMBIA LTDA", "COOTRANSCOL", "Narino", "BUESACO" ));
        companias.add(new CompaniaTransporte( "8000680463", "COOPERATIVA DE TRANSPORTADORES COMPARTIR LTDA.", "COOTRANSCOMPARTIR LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8918557586", "COOPERATIVA DE TRANSPORTADORES EL CONDOR LIMITADA", "COOTRANSCONDOR", "Boyaca", "PESCA" ));
        companias.add(new CompaniaTransporte( "8000860501", "COOPERATIVA DE TRANSPORTADORES DE COROZAL LTDA COOTRANSCOR", "COOTRANSCOR", "Sucre", "COROZAL" ));
        companias.add(new CompaniaTransporte( "8000193381", "COOPERATIVA DE TRANSPORTADORES DE CORDOBA LTDA", "COOTRANSCORD LTDA", "Narino", "CORDOBA" ));
        companias.add(new CompaniaTransporte( "8000929468", "COOPERATIVA MULTIACTIVA TRANSPORTADORES DE COTA LTDA.", "COOTRANSCOTA LTDA ", "Cundinamarca", "COTA" ));
        companias.add(new CompaniaTransporte( "8002475068", "COOTRANSCOY- COOP. DE TRANSPORTE COMUNITARIO DE YONDO", "COOTRANSCOY", "Antioquia", "YONDO" ));
        companias.add(new CompaniaTransporte( "8912241880", "COOPERATIVA DE TRANSPORTADORES DE CUMBAL", "COOTRANSCUM LTDA", "Narino", "CUMBAL" ));
        companias.add(new CompaniaTransporte( "8000704652", "COOTRANSDA- COOP. DE TRANSPORTADORES DE DONMATIAS ANTIOQUIA", "COOTRANSDA", "Antioquia", "DON MATIAS" ));
        companias.add(new CompaniaTransporte( "8001159143", "COOPERATIVA DE TRANSPORTADORES DE SAN DIEGO Y LA PAZ", "COOTRANSDIPAZ", "Cesar", "SAN DIEGO" ));
        companias.add(new CompaniaTransporte( "8460000450", "COOPERATIVA DE TRANSPORTES LA DORADA LIMITADA", "COOTRANSDORADA", "Putumayo", "SAN MIGUEL" ));
        companias.add(new CompaniaTransporte( "8919022863", "COOPERATIVA DE TRANSPORTADORES EL DOVIO VALLE LTDA", "COOTRANSDOVIO", "Valle del Cauca", "EL DOVIO" ));
        companias.add(new CompaniaTransporte( "8919006154", "COOPERATIVA DE TRANSPORTADORES DE SEVILLA LTD", "COOTRANSE LTDA.", "Valle del Cauca", "SEVILLA" ));
        companias.add(new CompaniaTransporte( "8908058824", "COOPERATIVA DE TRANSPORTADORES DE ANSERMA LTDA", "COOTRANSERMA LTDA", "Caldas", "ANSERMA" ));
        companias.add(new CompaniaTransporte( "8002045429", "COOPERATIVA DE TRANSPORTADORES DEL ESPINO", "COOTRANSESPINO LTDA", "Narino", "TUQUERRES" ));
        companias.add(new CompaniaTransporte( "8911005447", "COOP MULTIACTIVA TRANSPORTADORES FCIA COOTRANSFLORENCIA", "COOTRANSFLORENCIA", "Caqueta", "FLORENCIA" ));
        companias.add(new CompaniaTransporte( "8001099496", "COOPERATIVA INTEGTRAL DE TRANSPORTADORES DE FOMEQUE LTDA", "COOTRANSFOMEQUE LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8001065364", "COOPERATIVA DE TRANSPORTADORES DE FONTIBON", "COOTRANSFONTIBON", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002053577", "COOP. DE TRANSP. DE FUENTEDEORO COOTRANSFUENTEDEORO", "COOTRANSFUENTEDEORO LTDA.", "Meta", "FUENTE DE ORO" ));
        companias.add(new CompaniaTransporte( "8000675484", "COOPERATIVA DE TRANSPORTADORES MIXTOS DE FUNZA LTDA.", "COOTRANSFUNZA LTDA", "Cundinamarca", "FUNZA" ));
        companias.add(new CompaniaTransporte( "8906003238", "COOPERATIVA DE TRANSPORTADORES DE FUSAGASUGA LTDA", "COOTRANSFUSA LTDA", "Cundinamarca", "FUSAGASUGA" ));
        companias.add(new CompaniaTransporte( "8911900007", "COOPERATIVA TRANSPORTADORA GANADERA DEL HUILA Y CQTA LTDA", "COOTRANSGANADERA LTDA.", "Huila", "PALERMO" ));
        companias.add(new CompaniaTransporte( "8911008165", "COOPERATIVA DE TRANSPORTADORES DE GARZON", "COOTRANSGAR", "Huila", "GARZON" ));
        companias.add(new CompaniaTransporte( "8911012010", "COOPERATIVA DE TRANSPORTADORES DE GIGANTE LIMITADA", "COOTRANSGIGANTE LTDA", "Huila", "GIGANTE" ));
        companias.add(new CompaniaTransporte( "8906000559", "COOPERATIVA DE TRANSPORTADORES DE GIRARDOT LTDA", "COOTRANSGIRARDOT", "Cundinamarca", "GIRARDOT" ));
        companias.add(new CompaniaTransporte( "8240010921", "COOPERATIVA DE TRANSPORTADORES DE LA GLORIA COOTRANSGLORIA", "COOTRANSGLORIA", "Cesar", "LA GLORIA" ));
        companias.add(new CompaniaTransporte( "8000698882", "COOPERATIVA DE TRANSPORTADORES DE GUACHUCAL LTDA", "COOTRANSGUACHUCAL", "Narino", "GUACHUCAL" ));
        companias.add(new CompaniaTransporte( "8000106122", "COOPERATIVA DE TRANSPORTADORES GUAJARO LTDA", "COOTRANSGUAJARO", "Atlantico", "BARANOA" ));
        companias.add(new CompaniaTransporte( "8370000401", "COOPERATIVA DE TRANSPORTADORES DE GUALMATAN LTDA", "COOTRANSGUALMATAN LTDA", "Narino", "GUALMATAN" ));
        companias.add(new CompaniaTransporte( "8907015768", "COOPERATIVA DE TRANSPORTADORES DEL GUAMO LTDA.", "COOTRANSGUAMO LTDA.", "Tolima", "GUAMO" ));
        companias.add(new CompaniaTransporte( "8220029646", "COOPERATIVA DE TRANSPORTADORES DEL GUAVIARE LIMITADA.", "COOTRANSGUAVIARE ", "Guaviare", "SAN JOSE DEL GUAVIARE" ));
        companias.add(new CompaniaTransporte( "8905054247", "COOPERATIVA DE TRANSPORTADORES HACARITAMA LTDA.", "COOTRANSHACARITAMA LTDA", "Norte de Santander", "OCANA" ));
        companias.add(new CompaniaTransporte( "8911002997", "COOPERATIVA DE TRANSPORTADORES DEL HUILA LIMITADA", "COOTRANSHUILA LTDA", "Huila", "NEIVA" ));
        companias.add(new CompaniaTransporte( "8917011783", "COOPERATIVA DE TRANSPORTADORES SIMON BOLIVAR LTDA", "COOTRANSIBO", "Magdalena", "SANTA MARTA" ));
        companias.add(new CompaniaTransporte( "8001997147", "COOP DE TRANSPORTADORES DE ICONONZO COOTRANSICONONZO", "COOTRANSICONONZO", "Tolima", "ICONONZO" ));
        companias.add(new CompaniaTransporte( "8010000425", "COOP DE TRANSPORTADORES LOS LIBERTADORES DEL QUINDIO LTDA C", "COOTRANSLIBERTAD LTDA", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8001092965", "COOPERATIVA DE TRANSPORTADORES DE LOS LLANOS LTDA", "COOTRANSLLANOS LTDA", "Meta", "ACACIAS" ));
        companias.add(new CompaniaTransporte( "8240026251", "COOPERATIVA DE TRANSPORTADORES DE LA LOMA DE CALENTURA", "COOTRANSLOMA", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8902707383", "COOTRANSMAGDALENA LTDA", "COOTRANSMAGDALENA", "Santander", "SAN VICENTE DE CHUCURI" ));
        companias.add(new CompaniaTransporte( "8914082351", "COOPERATIVA DE TRANSPORTADORES DE MARSELLA LTDA", "COOTRANSMAR", "Risaralda", "MARSELLA" ));
        companias.add(new CompaniaTransporte( "8912017961", "COOPERATIVA DE TRANSPORTADORES DEL PUTUMAYO LTDA", "COOTRANSMAYO LTDA", "Putumayo", "PUERTO ASIS" ));
        companias.add(new CompaniaTransporte( "8907065760", "COOPERATIVA DE TRANSPORTADORES DE MELGAR LTDA COOTRANSMELGA", "COOTRANSMELGAR", "Tolima", "MELGAR" ));
        companias.add(new CompaniaTransporte( "8070068096", "COOP. DE TRANSPRES DEL MUNICIPIO DE GRAMALOTE LA MONGUISITA", "COOTRANSMONGUISITA", "Norte de Santander", "GRAMALOTE" ));
        companias.add(new CompaniaTransporte( "8000810958", "COOPERATIVA MUNDIAL DE TRANSPORTADORES LTDA", "COOTRANSMUNDIAL LTDA.", "Cundinamarca", "SOACHA" ));
        companias.add(new CompaniaTransporte( "8001930332", "COOPERATIVA DE TRANSPORTADORES DE LA SIERRA NEVADA", "COOTRANSNEVADA", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8908023378", "COOPERATIVA DE TRANSPORTADORES DEL NORTE DE CALDAS", "COOTRANSNORCALDAS", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8907021222", "COOP TRANSPORTADORES DEL NORTE TOLIMA LTDA COOTRANSNORTE", "COOTRANSNORTE", "Tolima", "FRESNO" ));
        companias.add(new CompaniaTransporte( "8000935001", "COOP DE TRANSPORTADORES DEL ORIENTE ATLANTICO LTDA.", "COOTRANSORIENTE", "Atlantico", "SANTO TOMAS" ));
        companias.add(new CompaniaTransporte( "8001980027", "COOPERATIVA DE TRANSPORTADORES DE OVEJAS", "COOTRANSOVE", "Sucre", "OVEJAS" ));
        companias.add(new CompaniaTransporte( "8000425035", "COOPERATIVA DE TRANSPORTADORES DE PERSONAL LIMITADA", "COOTRANSPER LTDA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8900014838", "COOPERATIVA DE TRANSPORTADORES DE PIJAO Y BUENAVISTA LTDA", "COOTRANSPIBU LTDA", "Quindio", "PIJAO" ));
        companias.add(new CompaniaTransporte( "8001756113", "COOP DE TRANSPORTADORES DE LA PLATA LTDA COOTRANSPLATENA", "COOTRANSPLATENA", "Huila", "LA PLATA" ));
        companias.add(new CompaniaTransporte( "8907029242", "COOP DE TRANSPORTADORES DE RIOBLANCO TOLIMA LTDA", "COOTRANSRIO LTDA.", "Tolima", "RIOBLANCO" ));
        companias.add(new CompaniaTransporte( "8908012612", "COOPERATIVA CENTRAL DE TRANSPORTADORES RIOSUCIO COOTRANSRIO", "COOTRANSRIO LTDA.", "Caldas", "RIOSUCIO" ));
        companias.add(new CompaniaTransporte( "8000999380", "COOPERATIVA DE TRANSPORTADORES EL ROSAL LTDA COOTRANSROSAL", "COOTRANSROSAL LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002122220", "COOPERATIVA DE TRANSPORTES DE LA SABANA DE BOGOTA LTDA.", "COOTRANSSA LTDA. ", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8001422520", "COOP TRANSPORTADORA TERRESTRE Y FLUVIAL DE ARAUCA LTDA", "COOTRANSTEFLUARAUCA LTDA", "Arauca", "ARAUCA" ));
        companias.add(new CompaniaTransporte( "8600168170", "COOPERATIVA DE TRANSPORTADORES DEL TEQUENDAMA LTDA", "COOTRANSTEQUENDAMA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8001132613", "COOPERATIVA DE TRANSPORTADORES DE TIBACUY LTDA.", "COOTRANSTIBACUY LTDA", "Cundinamarca", "TIBACUY" ));
        companias.add(new CompaniaTransporte( "8906004694", "COOPERATIVA DE TRANS Y CHOFERES DE TOCAIMA", "COOTRANSTOCAIMA", "Cundinamarca", "TOCAIMA" ));
        companias.add(new CompaniaTransporte( "8907010172", "COOPERATIVA DE TRANSPORTADORES DEL TOLIMA LTDA COOTRANSTOL", "COOTRANSTOL", "Tolima", "ESPINAL" ));
        companias.add(new CompaniaTransporte( "8001927059", "COOPERATIVA DE TRANSPORTADORES DE TOLU COOTRANSTOL", "COOTRANSTOL LTDA", "Sucre", "SANTIAGO DE TOLU" ));
        companias.add(new CompaniaTransporte( "8000860753", "COOP INTEGRAL DE TRANSPORTE DE TURBACO ", "COOTRANSTUR ", "Bolivar", "TURBACO" ));
        companias.add(new CompaniaTransporte( "8910007469", "COOPERATIVA DE TRANSPORTADORES TUCURA LTDA", "COOTRANSTUR LTDA.", "Cordoba", "MONTERIA" ));
        companias.add(new CompaniaTransporte( "8905011197", "COOPERATIVA DE TRANSPORTADORES UNIDOS", "COOTRANSUNIDOS", "Norte de Santander", "OCANA" ));
        companias.add(new CompaniaTransporte( "8001213251", "COOPERATIVA DE TRANSPORTADORES UNIDOS DEL MAGDALENA LTDA. ", "COOTRANSUNIMAG", "Magdalena", "CIENAGA" ));
        companias.add(new CompaniaTransporte( "8904806354", "COOPERATIVA DE TRANSPORTADORES URBANOS DE CARTAGENA LTDA", "COOTRANSURB LTDA", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8001475678", "COOTRANSUROCCIDENTE-COOP. TRADORES DEL URABA Y OCCIDENTE ANTI.", "COOTRANSUROCCIDENTE", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8002136307", "COOP. INTEGRAL DE TRANSPORTADORES DE VALDERRAMA", "COOTRANSVAL", "Boyaca", "SOCHA" ));
        companias.add(new CompaniaTransporte( "8002243370", "COOPERATIVA DE TRANSPORTADORES VALPARAISO LIMITADA", "COOTRANSVAL LTDA", "Cordoba", "PUEBLO NUEVO" ));
        companias.add(new CompaniaTransporte( "8918004324", "COOPERATIVA INTEGRAL DE TRANSPORTADORES DEL VALLE DE SAMACA ", "COOTRANSVALLE DE SAMACA", "Boyaca", "SAMACA" ));
        companias.add(new CompaniaTransporte( "8460005483", "COOPERATIVA DE TRANSPORTADORES DEL VALLE LTDA", "COOTRANSVALLE LTDA.", "Putumayo", "SIBUNDOY" ));
        companias.add(new CompaniaTransporte( "8002544850", "COOPERATIVA DE TRANSPORTADORES DE VILLANUEVA", "COOTRANSVI", "Bolivar", "VILLANUEVA" ));
        companias.add(new CompaniaTransporte( "8600315795", "COOPERATIVA ZIPAQUIREÑA DE TANSPORTADORES", "COOTRANSZIPA ASOCIACION COOPERATIVA", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8923011268", "COOP DE TRANSPORTADORES DE PAILITAS LTDA - COOTRAPAI", "COOTRAPAI", "Cesar", "PAILITAS" ));
        companias.add(new CompaniaTransporte( "8060019073", "COOPERATIVA DE TRANSPORTADORES Y PROPIETARIOS DE SANTA ROSA", "COOTRAPROSANTA", "Bolivar", "SANTA ROSA" ));
        companias.add(new CompaniaTransporte( "8001057169", "COOPERATIVA DE TRANSPORTADORES DE PAZ DE ARIPORO LTDA", "COOTRARIPORO LTDA", "Casanare", "PAZ DE ARIPORO" ));
        companias.add(new CompaniaTransporte( "8907029228", "COOPERATIVA DE TRANSPORTADORES DE ARMERO LTDA", "COOTRARMERO.", "Tolima", "LERIDA" ));
        companias.add(new CompaniaTransporte( "8002028875", "COOPERATIVA DE TRANSPORTES R.S.", "COOTRARS", "Antioquia", "CHIGORODO" ));
        companias.add(new CompaniaTransporte( "8002037183", "COOTRASAL - COOPERATIVA DE TRANSPORTADORES DE SAN LUIS", "COOTRASAL", "Antioquia", "SAN LUIS" ));
        companias.add(new CompaniaTransporte( "8001923601", "COOPERATIVA DE TRANSPORTADORES DE SAMPUES", "COOTRASAM", "Sucre", "SAMPUES" ));
        companias.add(new CompaniaTransporte( "8250013826", "COOPERATIVA DE TRANSPORTADORES DE SAN JUAN", "COOTRASAN", "La Guajira", "SAN JUAN DEL CESAR" ));
        companias.add(new CompaniaTransporte( "8290032552", "COOPERATIVA DE TRANSPORTADORES DE SANTA ROSA", "COOTRASAN", "Bolivar", "SANTA ROSA" ));
        companias.add(new CompaniaTransporte( "8909060331", "COOTRASANA - COOPE. DE TRANSPORTADORES SAN ANTONIO", "COOTRASANA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8002437310", "COOTRASANDINA - COOPERATIVA DE TRANSPORTES ANDINA", "COOTRASANDINA", "Antioquia", "ANDES" ));
        companias.add(new CompaniaTransporte( "8180002992", "COOTRASANJUAN - COOP. DE TRANSPORTE DE LA PROVINCIA DEL SAN JUAN", "COOTRASANJUAN", "Choco", "QUIBDO" ));
        companias.add(new CompaniaTransporte( "8070007109", "COOPERATIVA DE TRANSPORTADORES DE SARDINATA NORTE DE SANTANDE", "COOTRASAR", "Norte de Santander", "SARDINATA" ));
        companias.add(new CompaniaTransporte( "8902015099", "COOPERATIVA DE TRANSPORTADORES DEL SARAVITA LTDA.", "COOTRASARAVITA", "Santander", "SOCORRO" ));
        companias.add(new CompaniaTransporte( "8110064708", "COOTRANSBET - COOPERATIVA DE TRANSPORTE DE BETANIA-", "COOTRASBET", "Antioquia", "BETANIA" ));
        companias.add(new CompaniaTransporte( "8001108816", "COOPERATIVA DE TRANSPORTADORES DE SINCE LTDA", "COOTRASIN LTDA", "Sucre", "SINCE" ));
        companias.add(new CompaniaTransporte( "8922012353", "COOPERATIVA DE TRANSPORTES DE SUCRE", "COOTRASUCRE", "Sucre", "SINCELEJO" ));
        companias.add(new CompaniaTransporte( "8190052752", "COOP DE TRANS DEL SUR DEL MAGDALENA.COOTRASURMAG", "COOTRASURMAG", "Magdalena", "GUAMAL" ));
        companias.add(new CompaniaTransporte( "8110050954", "COOTRASVAL - COOPERATIVA TRANSPORTES DE VALDIVIA", "COOTRASVAL", "Antioquia", "VALDIVIA" ));
        companias.add(new CompaniaTransporte( "8002323342", "COOTRAUR -COOPERATIVA MULTIACTIVA DE TRANSPORTADORES DE URRAO", "COOTRAUR", "Antioquia", "URRAO" ));
        companias.add(new CompaniaTransporte( "8250026058", "COOPERATIVA DE TRANSPORTADORES DE URUMITA", "COOTRAUR", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8001445105", "COOTRAYAL - COOP. MULTIACTIVA DE TDORES DE YARUMAL - 21", "COOTRAYAL", "Antioquia", "YARUMAL" ));
        companias.add(new CompaniaTransporte( "8906000566", "COOPERATIVA DE TRANSPORTADORES VERACRUZ LTDA", "COOVERACRUZ LTDA ", "Cundinamarca", "AGUA DE DIOS" ));
        companias.add(new CompaniaTransporte( "8919008437", "COOPERATIVA DE TRANSPORADORES LA VICTORIA LTD", "COOVICTORIA LTDA", "Valle del Cauca", "LA VICTORIA" ));
        companias.add(new CompaniaTransporte( "8902009287", "COOPERATIVA SANTANDEREANA DE TRANSPORTES LIMITADA ", "COPETRAN LTDA.", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8905003887", "EMPRESA CORTA DISTANCIA LIMITADA", "CORTA DISTANCIA", "Norte de Santander", "VILLA DEL ROSARIO" ));
        companias.add(new CompaniaTransporte( "8902002186", "COTAXI", "COTAXI", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8918556707", "COOPERATIVA DE TRANSPORTADORES DEL DATIL LTDA", "COTRADATIL LTDA", "Boyaca", "SOATA" ));
        companias.add(new CompaniaTransporte( "8000611982", "COOPERTAIVA DE TRANSPORTADORES DE LA FRONTERA LTDA.", "COTRAFRON LTDA.", "La Guajira", "MAICAO" ));
        companias.add(new CompaniaTransporte( "8905004466", "COOPERATIVA DE TRANSPORTADORES NACIONALES DE PAMPLONA LTDA", "COTRANAL", "Norte de Santander", "PAMPLONA" ));
        companias.add(new CompaniaTransporte( "8902002115", "COTRANS LTDA.", "COTRANS LTDA", "Santander", "MALAGA" ));
        companias.add(new CompaniaTransporte( "8001755770", "COOPERATIVA DE TRANSPORTADORES DEL CATATUMBO COTRANSCAT", "COTRANSCAT", "Norte de Santander", "TIBU" ));
        companias.add(new CompaniaTransporte( "8320035042", "COMPAÑIA DE TRANSPORTADORES SANTAFE DE BOGOTA S.A.", "COTRANSFEBO S.A.", "Cundinamarca", "SOACHA" ));
        companias.add(new CompaniaTransporte( "8902077806", "COOPERATIVA DE TRANSPORTADORES RICAURTE LTDA", "COTRANSRICAURTE LTDA.", "Santander", "BARBOSA" ));
        companias.add(new CompaniaTransporte( "8920994211", "COOPERATIVA DE TRANSPORTADORES DE TAME COOTRANSTAME LTDA", "COTRANSTAME LTDA", "Arauca", "TAME" ));
        companias.add(new CompaniaTransporte( "8603511226", "COOPERATIVA DE TRANSPORTADORES VILLA DE LA MESA", "COTRANSVILLA LTDA ", "Cundinamarca", "LA MESA" ));
        companias.add(new CompaniaTransporte( "8902035073", "COOPERATIVA DE TRANSPORTADORES SAN GIL LTDA", "COTRASANGIL LTDA", "Santander", "SAN GIL" ));
        companias.add(new CompaniaTransporte( "8001643999", "COOPERATIVA INTEGRAL DE TRANSPORTE DE SOATA", "COTRASOATA", "Boyaca", "SOATA" ));
        companias.add(new CompaniaTransporte( "8908002560", "EMPRESA ARAUCA S A", "EMPRESA ARAUCA S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8240056209", "EMPRESA DE TRANSPORTE DEL SUR LTDA", "EMTRASUR", "Cesar", "AGUACHICA" ));
        companias.add(new CompaniaTransporte( "8250035821", "EMPRESA DE TRANSPORTE TERRESTRE EMULIR LTDA", "EMULIR LTDA", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "9013339413", "EXPRESO NUEVO TANGUA S.A.S.", "ENTAN S.A.S.", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8002286841", "EXPRESO ALMIRANTE PADILLA S.A.", "EXALPA S.A", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8901014210", "EXPRESO COLOMBIA CARIBE SOCIEDAD POR ACCIONES SIMPLIFICADA S.A.S.", "EXCOLCAR S.A.S.", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8230004507", "EXPRESO LA SABANA LTDA", "EXP. LA SABANA", "Sucre", "SINCE" ));
        companias.add(new CompaniaTransporte( "8000528698", "EXPRESO LOS PATRIOTAS S A", "EXPASA", "Boyaca", "TUNJA" ));
        companias.add(new CompaniaTransporte( "8909112574", "EXPRE - BELMIRA S.A.", "EXPRE-BELMIRA S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8901005318", "EXPRESO BRASILIA S.A.", "EXPRESO BRASILIA S.A.", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8002152840", "EXPRESO CAFETERO S.A.S.", "EXPRESO CAFETERO S.A.S.", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8180005919", "EXPRESO DEL PACIFICO S.A.S. - 58", "EXPRESO DEL PACIFICO S.A.S.", "Choco", "QUIBDO" ));
        companias.add(new CompaniaTransporte( "8002021330", "EXPRESO DEL SOL S.A.", "EXPRESO DEL SOL S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8913006515", "COMPAÑIA DE TRANSPORTES EXPRESO FLORIDA LTDA.", "EXPRESO FLORIDA.", "Valle del Cauca", "FLORIDA" ));
        companias.add(new CompaniaTransporte( "8080002434", "EXPRESO FUSACATAN LTDA.", "EXPRESO FUSACATAN LTDA.", "Cundinamarca", "FUSAGASUGA" ));
        companias.add(new CompaniaTransporte( "8001877912", "EXPRESO LA ORTEGUNA E.U.", "EXPRESO LA ORTEGUNA E.U.", "Tolima", "ORTEGA" ));
        companias.add(new CompaniaTransporte( "8912016915", "EXPRESO LAS LAJAS S.A.", "EXPRESO LAS LAJAS S.A.", "Narino", "IPIALES" ));
        companias.add(new CompaniaTransporte( "8600472411", "EXPRESO LOS COMUNEROS S. A. S.", "EXPRESO LOS COMUNEROS S. A. S.", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8908002729", "EXPRESO SIDERAL S A", "EXPRESO SIDERAL S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8320045022", "EXPRESO SURAMERICANO DE TRANSPORTADORES H 24 S.A.", "EXPRESO SURAMERICANO H 24 S.A.", "Cundinamarca", "SOACHA" ));
        companias.add(new CompaniaTransporte( "8903015779", "EXPRESO TREJOS LTDA", "EXPRESO TREJOS", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "9001197843", "EXPRESO DEL VIENTO S.A.", "EXPREVIENSA", "Cordoba", "SAN BERNARDO DEL VIENTO" ));
        companias.add(new CompaniaTransporte( "8001220235", "EXTRA RAPIDO EL NORTENO S A", "EXTRA RAPIDO EL NORTENO S.A.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8600011802", "FLOTA ANDINA LTDA", "FLOTA ANDINA LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600011811", "FLOTA AYACUCHO S.A.", "FLOTA AYACUCHO S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8909251244", "FLOTA CORDOVA RIONEGRO S.A. - 29", "FLOTA CORDOVA RG", "Antioquia", "RIONEGRO" ));
        companias.add(new CompaniaTransporte( "8909071943", "FLOTA EL CARMEN S.A ", "FLOTA EL CARMEN S.A", "Antioquia", "EL CARMEN DE VIBORAL" ));
        companias.add(new CompaniaTransporte( "8909031730", "FLOTA FREDONIA S.A.S.", "FLOTA FREDONIA S.A.S", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909118960", "FLOTA GRANADA S.A.S", "FLOTA GRANADA S.A.S.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8907002619", "FLOTA HONDA LTDA", "FLOTA HONDA LTDA.", "Tolima", "HONDA" ));
        companias.add(new CompaniaTransporte( "8907020106", "FLOTA LOS PUENTES S A", "FLOTA LOS PUENTES S.A.", "Tolima", "HONDA" ));
        companias.add(new CompaniaTransporte( "8600048383", "FLOTA MAGDALENA S.A.", "FLOTA MAGDALENA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8908007468", "FLOTA METROPOLITANA S.A.", "FLOTA METROPOLITANA S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8909014919", "ROMERO Y CIA FLOTA NORDESTE S C A-71", "FLOTA NORDESTE", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909031762", "FLOTA RIONEGRO S.A", "FLOTA RIONEGRO S.A", "Antioquia", "RIONEGRO" ));
        companias.add(new CompaniaTransporte( "8600221051", "FLOTA SAN VICENTE S.A.", "FLOTA SAN VICENTE SA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8918000758", "FLOTA SUGAMUXI S A", "FLOTA SUGAMUXI S.A", "Boyaca", "SOGAMOSO" ));
        companias.add(new CompaniaTransporte( "8600091436", "FLOTA VALLE DE TENZA S.A.", "FLOTA VALLE DE TENZA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600272835", "FLOTA ZIPA LTDA.", "FLOTA ZIPA LTDA.", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8908003039", "FLOTA OSPINA SANABRIA Y CIA S. A.", "FLOTAOSPINA SANABRIA", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8250034769", "FONSECA EXPRESS LTDA", "FONSECA EXPRESS LTDA", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8911045588", "TRANSPORTES EXPRESO LA GAITANA S.A", "GAITANA TOUR", "Huila", "NEIVA" ));
        companias.add(new CompaniaTransporte( "8919009689", "COOPERATIVA DE TRANSPORTADORES LA ANDINA LTDA", "LA ANDINA", "Valle del Cauca", "LA UNION" ));
        companias.add(new CompaniaTransporte( "8901014131", "TRANSPORTES LA COSTENA DURAN Y COMPANIA S.C.A.", "LA COSTEÑA", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8002040729", "TRANSPORTES LINEAS DEL VALLE S.A", "LINEAS DEL VALLE", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8914003573", "LINEAS PEREIRANAS S.A.", "LIPSA S.A.", "Risaralda", "DOSQUEBRADAS" ));
        companias.add(new CompaniaTransporte( "8001082724", "ORGANIZACION COOPERATIVA DE TRANSPORTADORES LOS DELFINES ", "LOS DELFINES O.C.", "Boyaca", "RAMIRIQUI" ));
        companias.add(new CompaniaTransporte( "8000042838", "TRANSPORTES MONTEBELLO S A", "MONTEBELLO", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8000602725", "MONTERIANA DE TRANSPORTE S.A.S.", "MONTRA S.A.S.", "Cordoba", "MONTERIA" ));
        companias.add(new CompaniaTransporte( "8002000745", "COOP MULTIACTIVA DE TRANS. MOTORISTAS DE SANTA ROSA DE C", "MOSARCOOP", "Risaralda", "SANTA ROSA DE CABAL" ));
        companias.add(new CompaniaTransporte( "8001683822", "NUEVA FLOTA BOYACA S.A.", "NUEVA FLOTA BOYACA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8919003855", "NUEVO TRANSPORTES CHOCO LIMITADA Y COMPANIA S C S", "NUEVO TRANSPORTES CHOCO LTDA", "Valle del Cauca", "CARTAGO" ));
        companias.add(new CompaniaTransporte( "9001295216", "COOPERATIVA MULTIACTIVA DE LA JAGUA DE IBIRICO", "OJINEGRO", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8600144939", "COOPERATIVA MULTIACTIVA DE TRANSPORTARORES OMEGA LTDA.", "OMEGA LTDA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8903027977", "COOPERATIVA INTEGRAL DE TRANSPORTADORES FLORIDA CALI LTDA", "PAPAGAYO", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8001736669", "RADIO TAXI TAME LTDA", "RADIO TAXI TAME LTDA", "Arauca", "TAME" ));
        companias.add(new CompaniaTransporte( "8002099614", "RADIO TAXI UPARS. LTDA", "RADIO TAXI UPARS. LTDA", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8903161377", "COOPERATIVA DE TRANSPORTADORES RAPIDO AEROPUERTO LTDA", "RAPIDO AEROPUERTO LTDA", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8600137978", "RAPIDO EL CARMEN LTDA", "RAPIDO EL CARMEN LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8920015295", "RAPIDO LOS CENTAUROS S.A.", "RAPIDO LOS CENTAUROS", "Meta", "VILLAVICENCIO" ));
        companias.add(new CompaniaTransporte( "8909040823", "RAPIDO MEDELLIN RIONEGRO S A. - 35", "RAPIDO MEDELLIN RIONEGRO", "Antioquia", "RIONEGRO" ));
        companias.add(new CompaniaTransporte( "8909028758", "TRANSPORTES RAPIDO OCHOA S A", "RAPIDO OCHOA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8600020823", "RAPIDO SANTA LTDA", "RAPIDO SANTA LTDA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8915001949", "COOPERATIVA INTEGRAL DE TRANSPORTES RAPIDO TAMBO LTDA", "RAPIDO TAMBO LTDA", "Cauca", "POPAYAN" ));
        companias.add(new CompaniaTransporte( "8907004765", "TRANSPORTES RAPIDO TOLIMA S A", "RAPIDO TOLIMA S.A.", "Tolima", "IBAGUE" ));
        companias.add(new CompaniaTransporte( "8904004363", "EMP DE TRANSPORTE RENACIENTE S A", "RENACIENTE S.A.", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8908006570", "GRAN TRANSPORTADORA RIO TAX S A", "RIO TAX S.A.", "Caldas", "LA DORADA" ));
        companias.add(new CompaniaTransporte( "8002156320", "TRANSPORTES RIVERA DEL MAGDALENA LTDA.", "RIVERMAG", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8922004957", "DALES MURILLO TRANSP SAN NICOLAS S C A", "SAN NICOLAS", "Sucre", "SINCELEJO" ));
        companias.add(new CompaniaTransporte( "8909116283", "SANTRA - SOCIEDAD ANTIOQUENA DE TRANSPORTES LTDA", "SANTRA LTDA.", "Antioquia", "SABANETA" ));
        companias.add(new CompaniaTransporte( "8600029501", "SOCIEDAD IMPORTADORA Y DISTRIBUIDORA AUTOMOTORA S.A.", "SIDAUTO S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600102056", "SOCIEDAD NACIONAL TRANSPORTADORA LTDA.", "SONATRANS LTDA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8915005515", "SOCIEDAD TRANSPORTADORA DEL CAUCA S.A.", "SOTRACAUCA S.A.", "Cauca", "POPAYAN" ));
        companias.add(new CompaniaTransporte( "8910000938", "SOCIEDAD TRANSPORTADORA DE CORDOBA S.A.", "SOTRACOR S.A.", "Cordoba", "MONTERIA" ));
        companias.add(new CompaniaTransporte( "8909365751", "SOTRADORADAL - SOCIEDAD TRANSPORTADORA DORADAL S.A.", "SOTRADORADAL S.A.", "Antioquia", "PUERTO TRIUNFO" ));
        companias.add(new CompaniaTransporte( "8909180928", "SOTRAGOLFO LTDA - 38", "SOTRAGOLFO", "Antioquia", "APARTADO" ));
        companias.add(new CompaniaTransporte( "8909128111", "SOTRAGUR - SOCIEDAD TRANSPORTES GUARNE S.A.", "SOTRAGUR S.A.", "Antioquia", "GUARNE" ));
        companias.add(new CompaniaTransporte( "8600757031", "SOTRAM S.A", "SOTRAM S.A", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8902706615", "SOCIEDAD TRANSPORTADORA DEL MAGDALENA MEDIO S.A.", "SOTRAMAGDALENA S.A.", "Bolivar", "SANTA ROSA DEL SUR" ));
        companias.add(new CompaniaTransporte( "8000503562", "SOTRAMAR - SOCIEDAD TRANSPORTADORA DE MARINILLA S A - 40", "SOTRAMAR S.A", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8600475606", "SOCIEDAD TRANSPORTADORA DE LOS ANDES S.A.", "SOTRANDES S. A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8000799464", "SOCIEDAD COOPERATIVA TRANSPORTADORES DEL NORTE TOLIMA LTDA", "SOTRANSNORTE", "Tolima", "PALOCABILDO" ));
        companias.add(new CompaniaTransporte( "8909146058", "SOTRANSODA S.A.S - 42", "SOTRANSODA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8020075643", "SOCIEDAD DE TRANSPORTADORES DE PALERMO LTDA", "SOTRANSPA", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8300300862", "SOCIEDAD TRANSPORTADORA DEL TOCAREMA S.A.", "SOTRANSTOCAREMA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8909111702", "SOTRAPEÑOL - SOCIEDAD TRANSPORTADORA DE EL PEÑOL LTDA", "SOTRAPEÑOL", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909131821", "SOTRARETIRO - SOC. TRADORA DE EL RETIRO INVER TOBON LOPEZ Y CIA", "SOTRARETIRO", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8922001612", "SOCIEDAD TRANSPORTADORA DE LA SABANA S.C.A.", "SOTRASAB", "Sucre", "COROZAL" ));
        companias.add(new CompaniaTransporte( "8909140912", "SOTRASABAR - SOCIEDAD TRANSPORTADORA SANTA BARBARA", "SOTRASABAR S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8000178921", "SOTRASAN S.A. SOCIEDAD TRANSPORTADORA DE SANTAGUEDA S.A.", "SOTRASAN S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8909128331", "SOTRASANVICENTE Y GUATAPE LA PIEDRA S.C.A.", "SOTRASANVICENTE Y GUATAPE LA PIEDRA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8110065168", "SOTRAUR - SOCIEDAD DE TRANSPORTES DE URRAO LTDA", "SOTRAUR", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909027601", "SOTRAURABA - SOCIEDAD TRANSPORTADORA DE URABA S A - 48", "SOTRAURABA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8110349381", "TRANSPORTES SOTRAYAR SA ", "SOTRAYAR", "Antioquia", "YARUMAL" ));
        companias.add(new CompaniaTransporte( "8908007135", "SUAUTOMOVIL S A", "SUAUTOMOVIL S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8919001185", "TAX CARTAGO S.A", "TAX CARTAGO S.A", "Valle del Cauca", "CARTAGO" ));
        companias.add(new CompaniaTransporte( "8914003430", "TAX CENTRAL S.A.", "TAX CENTRAL", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8908001849", "COOPERATIVA DE TRANSPORTE TAX LA FERIA", "TAX LA FERIA", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8920001130", "TAX META S A", "TAX META S.A", "Meta", "VILLAVICENCIO" ));
        companias.add(new CompaniaTransporte( "8900023540", "TAX PARAMO S A", "TAX PARAMO S.A.", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8912242667", "COOPERATIVA SURANDINA DE TAXISTAS LTDA", "TAXANDINA", "Narino", "PUPIALES" ));
        companias.add(new CompaniaTransporte( "8915002771", "COOPERATIVA INTEGRAL DE TAXIS BELALCAZAR", "TAXBELALCAZAR", "Cauca", "POPAYAN" ));
        companias.add(new CompaniaTransporte( "8002007158", "TAXIS LA SABANA S A", "TAXIS LA SABANA", "Narino", "GUACHUCAL" ));
        companias.add(new CompaniaTransporte( "8909109703", "TRANSPORTES JERICO PUEBLORRICO TARSO S.A.S. - 58", "TJPT", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909032311", "TRANSPORTES MONTEBELLO LTDA", "TM", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8002071888", "TRANSPORTE INTERNACIONAL ESPECIAL S.A.", "TRAINES S.A. ", "Cundinamarca", "MADRID" ));
        companias.add(new CompaniaTransporte( "8002369468", "TRANSPORTES QUILICHAO LIMITADA TRANSQUILICHAO", "TRAN QULICHAO", "Cauca", "SANTANDER DE QUILICHAO" ));
        companias.add(new CompaniaTransporte( "8913009701", "EMPRESA DE TRANSPORTES CALIMA S A", "TRANPORTES CALIMA S.A.", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8600300808", "TRANSPORTES EXPRESO PAZ DEL RIO S.A.", "TRANS - EXPRADERIO S.A.", "Boyaca", "DUITAMA" ));
        companias.add(new CompaniaTransporte( "8919000306", "TRANSPORTES GALVEZ S A", "TRANS GALVEZ", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8903010746", "TRANSPORTES INDUSTRIALES PUERTO ISAACS S A", "TRANS INDUSTRIALES PUERTO ISAACS", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8000305982", "COOPERATIVA DE TRANSPORTADORES LA VEGA LTDA", "TRANS LA VEGA LTDA", "Caldas", "SUPIA" ));
        companias.add(new CompaniaTransporte( "8919028285", "SOCIEDAD TRANSPORTADORA LOS TOLUES S.A.", "TRANS LOS TOLUES", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8905002871", "TRANSPORTES PETROLEA S A", "TRANS PETROLEA S.A.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8919001415", "EMPRESA TRANSPORTES PRIMAVERA LTDA", "TRANS PRIMAVERA LTDA", "Valle del Cauca", "TRUJILLO" ));
        companias.add(new CompaniaTransporte( "8001536742", "TRANSPORTES RENACER S.A. TRANSRENACER S.A.", "TRANS RENACER LTDA.", "Valle del Cauca", "GUADALAJARA DE BUGA" ));
        companias.add(new CompaniaTransporte( "8919016671", "TRANSPORTES SALONICA S.A.", "TRANS SALONICA SA", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8919000012", "TRANSPORTES TOBAR LTDA.", "TRANS TOBAR LTDA", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8919000313", "EMPRESA DE TRANSPORTES TRANS TORO LTDA", "TRANS TORO LTDA", "Valle del Cauca", "TORO" ));
        companias.add(new CompaniaTransporte( "8914018341", "NUEVO TRANSPORTES VILLA RODAS S A", "TRANS VILLA RODAS", "Valle del Cauca", "CARTAGO" ));
        companias.add(new CompaniaTransporte( "8903010825", "TRANS YUMBO S A", "TRANS YUMBO", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8903069878", "TRANSPORTES PUERTO TEJADA LTDA", "TRANS. PUERTO TEJADA", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8907015696", "TRANSPORTES PURIFICACION S A", "TRANS. PURIFICACION S.A.", "Tolima", "IBAGUE" ));
        companias.add(new CompaniaTransporte( "8905050964", "TRANSPORTES RISARALDA DEL NORTE S A", "TRANS. RISANORTE S.A.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8914016977", "SOCIEDAD DE TRANSPORTADORES DE LA VIRGINIA S A", "TRANS. VIRGINIA S.A.", "Risaralda", "LA VIRGINIA" ));
        companias.add(new CompaniaTransporte( "8912002971", "TRANSPORTES SANDONA S.A.", "TRANSANDONA S.A.", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8908007450", "TRANSPORTES CAMBIA LTDA", "TRANSCAMBIA LTDA.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8002373090", "COOPERATIVA DE TRANSPORTES TRANSCARIBE", "TRANSCARIBE EXPRESS", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8918008841", "TRANSPORTES Y CONSTRUCCIONES BOYACA S.A.", "TRANSCOBOY S.A.", "Boyaca", "PUERTO BOYACA" ));
        companias.add(new CompaniaTransporte( "8000511127", "TRANSPORTES COGUA LTDA.", "TRANSCOGUA LTDA", "Cundinamarca", "COGUA" ));
        companias.add(new CompaniaTransporte( "8600410045", "TRANSPORTES EXPRESO CUNDINAMARCA LTDA.", "TRANSCUNDINAMARCA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8901014084", "TRANSDIAZ S.A.S.", "TRANSDIAZ S.A.S.", "Atlantico", "SOLEDAD" ));
        companias.add(new CompaniaTransporte( "8909028781", "TRANSPORTES SEGOVIA Y CIA S C A-204", "TRANSEGOVIA ", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8250035925", "EMPRESA DE TTE Y SERVICIOS ESPECIALES DE LA GUAJIRA ", "TRANSEGUA ", "La Guajira", "BARRANCAS" ));
        companias.add(new CompaniaTransporte( "8002106691", "TRANSPORTES GALAXIA S.A.", "TRANSGALAXIA S.A.", "Cundinamarca", "FACATATIVA" ));
        companias.add(new CompaniaTransporte( "8904005118", "INVERSIONES TRANSPORTES GONZALEZ SCA", "TRANSGONZALEZ S.C.A", "Sucre", "SINCELEJO" ));
        companias.add(new CompaniaTransporte( "8002068558", "EMPRESA COMUNITARIA DE TRANSPORTE INTERMUNICIPAL GRAN COLOMBIANA DE TUTA S.A.", "TRANSGRACOL S.A.", "Boyaca", "TUTA" ));
        companias.add(new CompaniaTransporte( "8001078301", "SOCIEDAD TRANSPORTADORA VALLE DE SIBUNDOY S.A.", "TRANSIBUNDOY S.A.", "Putumayo", "SIBUNDOY" ));
        companias.add(new CompaniaTransporte( "9006408188", "TRANSPORTES SINIFANAES Y CIA. LTDA.", "TRANSINIFANAES LTDA.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8912006451", "TRANSPORTADORES DE IPIALES S A", "TRANSIPIALES S.A.", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8902009176", "EMPRESA DE TRANSPORTES LEBRIJA LIMITADA", "TRANSLEBRIJA", "Santander", "LEBRIJA" ));
        companias.add(new CompaniaTransporte( "8903010651", "EMPRESA TRANSPORTES ARCESIO DIAZ Y CIA LTDA.", "TRANSMAR", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8001177794", "TRANSPORTES NEIRA NARIQO", "TRANSNEIRA S.A.", "Narino", "TUQUERRES" ));
        companias.add(new CompaniaTransporte( "8909108712", "TRANSORIENTE - TRANSPORTES ORIENTE ANTIOQUENO S.A.", "TRANSORIENTE", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8604000838", "EXPRESO DE TRANSPORTE COLECTIVO DEL ORIENTE S.A.", "TRANSORIENTE S.A. ", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "9006092963", "TRANSPORTES SOTOMAYOR S.A.S.", "TRANSOTOMAYOR S.A.S.", "Narino", "LOS ANDES" ));
        companias.add(new CompaniaTransporte( "8909114603", "TRANSP JUAN B VASQUEZ CIA S C A", "TRANSP JUAN B VASQUEZ CIA S C A", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8600090563", "TRANSPORTES BERMUDEZ S.A", "TRANSP. BERMUDEZ S.A", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8919008490", "TRANSPORTES CUNCHIPA S.A.", "TRANSP. CUNCHIPA", "Valle del Cauca", "TULUA" ));
        companias.add(new CompaniaTransporte( "8600304398", "TRANSPORTES VILLETAX S.A", "TRANSP. VILLETAX S.A", "Cundinamarca", "FACATATIVA" ));
        companias.add(new CompaniaTransporte( "8902009517", "TRANSPORTES PIEDECUESTA S.A.", "TRANSPIEDECUESTA S.A.", "Santander", "PIEDECUESTA" ));
        companias.add(new CompaniaTransporte( "8200013598", "TRANSPORTES EL PINO SABOYA S.A.", "TRANSPINO S.A.", "Boyaca", "RAMIRIQUI" ));
        companias.add(new CompaniaTransporte( "8600061876", "TRANSPORTES ALIANZA S.A.", "TRANSPORTES ALIANZA S.A.", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8919003174", "TRANSPORTES ARGELIA Y CAIRO S.A.S.", "TRANSPORTES ARGELIA Y CAIRO S.A.S.", "Valle del Cauca", "CARTAGO" ));
        companias.add(new CompaniaTransporte( "8920006251", "TRANSPORTES ARIMENA S A", "TRANSPORTES ARIMENA S.A", "Meta", "VILLAVICENCIO" ));
        companias.add(new CompaniaTransporte( "8002124338", "TRANSPORTES ARIZONA S.A.", "TRANSPORTES ARIZONA S.A.", "Cundinamarca", "CHOCONTA" ));
        companias.add(new CompaniaTransporte( "8904029071", "TRANSPORTES AUTO RIO Y CIA LTDA. S.C.A.", "TRANSPORTES AUTO RIO Y CIA LTDA ", "Bolivar", "MAGANGUE" ));
        companias.add(new CompaniaTransporte( "8920005656", "TRANSPORTES AUTOLLANOS S A", "TRANSPORTES AUTOLLANOS S.A.", "Meta", "VILLAVICENCIO" ));
        companias.add(new CompaniaTransporte( "8913010187", "EMPRESA DE TRANSPORTES BUGA Y COMPAÑIA LIMITADA", "TRANSPORTES BUGA LTDA", "Valle del Cauca", "GUADALAJARA DE BUGA" ));
        companias.add(new CompaniaTransporte( "8919009261", "TRANSPORTES DINAMARCA S.A.", "TRANSPORTES DINAMARCA S.A.", "Valle del Cauca", "SEVILLA" ));
        companias.add(new CompaniaTransporte( "8600354795", "TRANSPORTES ESMERALDA SAS", "TRANSPORTES ESMERALDA SAS", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8909028726", "TRANSPORTES GOMEZ HERNANDEZ S.A -191", "TRANSPORTES GOMEZ HERNANDEZ S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8000363944", "TRANSPORTES GRAN CALDAS S.A.", "TRANSPORTES GRAN CALDAS S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8600784277", "TRANSPORTES GUASCA S.A.S.", "TRANSPORTES GUASCA S.A.S.", "Cundinamarca", "GUASCA" ));
        companias.add(new CompaniaTransporte( "8908046142", "TRANSPORTES IRRA S A", "TRANSPORTES IRRA S.A.", "Caldas", "MANIZALES" ));
        companias.add(new CompaniaTransporte( "8002163829", "TRANSPORTES LA ESPERANZA S.A", "TRANSPORTES LA ESPERANZA S.A", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8305116257", "COOPERATIVA DE TRANSPORTE DE LA GUAJIRA", "TRANSPORTES LA GUAJIRA", "La Guajira", "RIOHACHA" ));
        companias.add(new CompaniaTransporte( "8001037905", "TRANSPORTES LA IBAGUEREÑA S A", "TRANSPORTES LA IBAGUERENA", "Tolima", "IBAGUE" ));
        companias.add(new CompaniaTransporte( "8910001595", "INVERSIONES DE LA OSSA & ESPITIA TRANSPORTES LUZ S.A.S.", "TRANSPORTES LUZ S.A.S.", "Cordoba", "MONTERIA" ));
        companias.add(new CompaniaTransporte( "8920029601", "TRANSPORTES MORICHAL S.A.", "TRANSPORTES MORICHAL S.A.", "Meta", "VILLAVICENCIO" ));
        companias.add(new CompaniaTransporte( "8918014501", "TRANSPORTES LOS MUISCAS S A", "TRANSPORTES MUISCAS S.A", "Boyaca", "TUNJA" ));
        companias.add(new CompaniaTransporte( "8905013638", "MANUEL PAREDES CASTELLANOS TRANSPORTES PERALONSO S.A.S.", "TRANSPORTES PERALONSO LTDA", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8002431010", "TRANSPORTES PROVIDENCIA S. A.", "TRANSPORTES PROVIDENCIA S. A.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8000473522", "TRANSPORTES RAPIDO AMAGA S.A.S.", "TRANSPORTES RAPIDO AMAGA S.A.S.", "Antioquia", "CALDAS" ));
        companias.add(new CompaniaTransporte( "8909112607", "TTES SALGAR - INVERS. RODRIGUEZ OSORIO Y CIA TTESSALGAR S C A", "TRANSPORTES SALGAR S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8190006358", "TRANSPORTES SENSACION LTDA", "TRANSPORTES SENSACION LIMITADA", "Magdalena", "SANTA MARTA" ));
        companias.add(new CompaniaTransporte( "9006586331", "TRANSPORTES SUPEREXPRESS S.A.S.", "TRANSPORTES SUPEREXPRESS S.A.S.", "Cesar", "VALLEDUPAR" ));
        companias.add(new CompaniaTransporte( "8002061242", "TRANSPORTES TISQUESUSA S.A.", "TRANSPORTES TISQUESUSA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002181735", "TRANSPORTES UNIDOS DEL NORTE", "TRANSPORTES UNIDOS DEL NORTE", "Cundinamarca", "CHIA" ));
        companias.add(new CompaniaTransporte( "8908025460", "TRANSPORTES UNION ANSERMA S A", "TRANSPORTES UNION", "Caldas", "ANSERMA" ));
        companias.add(new CompaniaTransporte( "8002144448", "TRANSPORTES REINA S A", "TRANSREINA S.A.", "Boyaca", "CHIQUINQUIRA" ));
        companias.add(new CompaniaTransporte( "8902038386", "TRANSPORTES SANTANDER S.A.", "TRANSSANDER S.A.", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8900002163", "TRANSPORTES TEBAIDA S A", "TRANSTEBAIDA S.A.", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8600375255", "TRANSPORTES Y SERVICIOS TEUSACA SAS", "TRANSTEUSACA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8000412559", "TRANSPORTES TIERRA GRATA Y CIA. LTDA.", "TRANSTIERRA GRATA", "Cundinamarca", "FUSAGASUGA" ));
        companias.add(new CompaniaTransporte( "8320023951", "TRANSTOCARINDA S.A.", "TRANSTOCARINDA S.A.", "Cundinamarca", "TOCANCIPA" ));
        companias.add(new CompaniaTransporte( "8909014301", "TRANSPORTES UNIDOS LA CEJA S.A.", "TRANSUNIDOS LOA CEJA", "Antioquia", "LA CEJA" ));
        companias.add(new CompaniaTransporte( "8903005031", "CIA DE TRANSPORTES AUTOMOTORES SANTA ROSA ROBLES S A ", "TRANSUR SA", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8600146293", "TRANSPORTES VALVANERA S.A.", "TRANSVALVANERA S.A. ", "Cundinamarca", "CHIA" ));
        companias.add(new CompaniaTransporte( "8911903223", "TRANSPORTES DEL YARI S A", "TRANSYARY S.A", "Caqueta", "FLORENCIA" ));
        companias.add(new CompaniaTransporte( "8002469708", "SOCIEDAD TRANSPORTADORA DEL SAN JORGE TSJ LIMITADA", "TRASANJORGE TSJ LTDA.", "Cordoba", "MONTELIBANO" ));
        companias.add(new CompaniaTransporte( "8110365499", "TRASURAN S.A.", "TRASURAN S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909028916", "TRATAM - TRANSPORTE TITIRIBI AMAGA MEDELLIN S.AS.", "TRATAM S.A.S.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8908021790", "TRANSPORTADORES DE VITERBO S.A.", "TRNSPORTADORES DE VITERBO S.A.", "Caldas", "VITERBO" ));
        companias.add(new CompaniaTransporte( "8909130022", "TRANSPORTES SUROESTE ANTIOQUENO S.A - 207", "TSA", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8916000434", "TRANSPORTES PROGRESO DEL CHOCO LTDA", "TTES PROGRESO DEL CHOCO", "Choco", "QUIBDO" ));
        companias.add(new CompaniaTransporte( "8909209903", "TRANSPORTES SAFERBO S.A-202", "TTES SAFERBO ", "Antioquia", "SABANETA" ));
        companias.add(new CompaniaTransporte( "8909242380", "VELORIENTE - SUAREZ Y CIA. TTES. VELOZ DEL ORIENTE S C A.", "TTES VELORIENTE", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8000796190", "TRANSPORTADORES DEL VALLE DEL GUAMUEZ S A", "TTRANSGUAMUEZ S.A.", "Putumayo", "VALLE DEL GUAMUEZ" ));
        companias.add(new CompaniaTransporte( "8002015117", "UNION DE TRANSPORTADORES DE MELGAR S.A. UNITRANSMELGAR S.A", "UNIGASMELGAR", "Tolima", "MELGAR" ));
        companias.add(new CompaniaTransporte( "8904004428", "UNION DE TRANSPT. DE LA COSTA S.A - UNITRANSCO S.A", "UNITRANSCO ", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8080003504", "UNIDAD SOCIAL TRANSPORTADORA DE SILVANIA S.A.", "USATRANS S.A.", "Cundinamarca", "SILVANIA" ));
        companias.add(new CompaniaTransporte( "8002200647", "VALLECAUCANA DE TRANSPORTES S A", "VALLECAUCANA DE TRANSPORTES S.A.", "Cauca", "SANTANDER DE QUILICHAO" ));
        companias.add(new CompaniaTransporte( "8907001896", "COOPERATIVA DE TRANSPORTES VELOTAX LIMITADA", "VELOTAX", "Tolima", "IBAGUE" ));
        companias.add(new CompaniaTransporte( "8002516276", "YAMEYA S.A. - TRANSPORTES YARUMAL MEDELLIN YARUMAL ", "YAMEYA", "Antioquia", "YARUMAL" ));
        companias.add(new CompaniaTransporte( "8000175846", "COMPAÑIA LIBERTADOR SA", "COMPAÑIA LIBERTADOR SA", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8000332444", "EXPRESO LIBERTADOR LTDA", "EXPRESO LIBERTADOR LTDA", "Putumayo", "PUERTO GUZMAN" ));
        companias.add(new CompaniaTransporte( "8000541937", "TRANSPORTES CISNEROS - ENTRERRIOS LTDA Y CIA S.C.A.", "TRANSPORTES CISNEROS - ENTRERRIOS LTDA Y CIA S.C.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8001054164", "TRANSPORTES SAN ANTONIO DEL TEQUENDAMA SAS", "TRANSPORTES SAN ANTONIO DEL TEQUENDAMA SAS", "Cundinamarca", "SAN ANTONIO DEL TEQUEND" ));
        companias.add(new CompaniaTransporte( "8001261478", "TAXIS FURATENA S.A.", "TAXIS FURATENA S.A.", "Boyaca", "CHIQUINQUIRA" ));
        companias.add(new CompaniaTransporte( "8001702347", "TRANSPORTES GACHETA S.A.", "TRANSPORTES GACHETA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002061281", "SOCIEDAD COMERCIAL SERVIAJES LTDA", "SOCIEDAD COMERCIAL SERVIAJES LTDA", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "8002101760", "TRANS UNISA S.A.", "TRANS UNISA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002279373", "CONTINENTAL BUS S.A.", "CONTINENTAL BUS S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8002327954", "TRANSPORTES LA VERDE S.A.", "TRANSPORTES LA VERDE S.A.", "Boyaca", "CHIQUINQUIRA" ));
        companias.add(new CompaniaTransporte( "8020011478", "EXPRESO DEL ATLANTICO S.A", "EXPRESO DEL ATLANTICO S.A", "Atlantico", "POLONUEVO" ));
        companias.add(new CompaniaTransporte( "8070014401", "EMPRESA DE TRANSPORTE LA BELENCITA S.A.S.", "EMPRESA DE TRANSPORTE LA BELENCITA S.A.S.", "Norte de Santander", "SALAZAR" ));
        companias.add(new CompaniaTransporte( "8110099426", "TRANSPORTES LOS FARALLONES S.A.S. ", "TRANSPORTES LOS FARALLONES S.A.S. ", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8110394638", "TRANSMERCEDES S.A.S", "TRANSMERCEDES S.A.S", "Antioquia", "LA PINTADA" ));
        companias.add(new CompaniaTransporte( "8140000099", "EXPRESO VALLE DE ATRIZ S.A.", "EXPRESO VALLE DE ATRIZ S.A.", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8200039976", "SOCIEDAD LANCEROS EXPRESO S.A.S.", "SOCIEDAD LANCEROS EXPRESO S.A.S.", "Boyaca", "DUITAMA" ));
        companias.add(new CompaniaTransporte( "8600011834", "FLOTA SANTA FE LTDA.", "FLOTA SANTA FE LTDA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600013712", "AUTOBOY S.A", "AUTOBOY S.A", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600025666", "FLOTA LA MACARENA S.A.", "FLOTA LA MACARENA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600047631", "FLOTA AGUILA S.A.", "FLOTA AGUILA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600047661", "FLOTA RIONEGRO CUNDINAMARCA S.A.S.", "FLOTA RIONEGRO CUNDINAMARCA S.A.S.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600051081", "EXPRESO BOLIVARIANO S.A.", "EXPRESO BOLIVARIANO S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600053133", "EXPRESO DE LA SABANA S.A.S.", "EXPRESO DE LA SABANA S.A.S.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600061195", "COMPAÑIA METROPOLITANA DE TRANSPORTES S.A.", "COMPAÑIA METROPOLITANA DE TRANSPORTES S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600061511", "EXPRESO GOMEZ VILLA SAS", "EXPRESO GOMEZ VILLA SAS", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600179428", "FLOTA CHIA LTDA.", "FLOTA CHIA LTDA.", "Cundinamarca", "CHIA" ));
        companias.add(new CompaniaTransporte( "8600265502", "AMERICANA DE TRANSPORTES TERRESTRES LTDA", "AMERICANA DE TRANSPORTES TERRESTRES LTDA", "Cundinamarca", "FACATATIVA" ));
        companias.add(new CompaniaTransporte( "8600282030", "NUEVA TRANSPORTADORA DE BOGOTA S A", "NUEVA TRANSPORTADORA DE BOGOTA S A", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600371102", "AUTO SERVICIO CHIA LTDA", "AUTO SERVICIO CHIA LTDA", "Cundinamarca", "CHIA" ));
        companias.add(new CompaniaTransporte( "8600398653", "TRANSPORTADORA EL TRIUNFO S.A.", "TRANSPORTADORA EL TRIUNFO S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8600598680", "TRANSPORTES VELOSIBA S.A.", "TRANSPORTES VELOSIBA S.A.", "Cundinamarca", "SIBATE" ));
        companias.add(new CompaniaTransporte( "8600624403", "EXPRESO GAVIOTA S.A.", "EXPRESO GAVIOTA S.A.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8900002131", "TRANSPORTES ARMENIA S A", "TRANSPORTES ARMENIA S A", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8900027210", "NUEVO RAPIDO QUINDIO S.A", "NUEVO RAPIDO QUINDIO S.A", "Quindio", "ARMENIA" ));
        companias.add(new CompaniaTransporte( "8901029991", "TRANSPORTES LA COSTEÑA VELOZ S.A.S.", "TRANSPORTES LA COSTEÑA VELOZ S.A.S.", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "8901062485", "TRANSPORTE COSTA AZUL LIMITADA", "TRANSPORTE COSTA AZUL LIMITADA", "Atlantico", "PUERTO COLOMBIA" ));
        companias.add(new CompaniaTransporte( "8902003161", "EMPRESA DE AUTOVILES CADIZ S.A.", "EMPRESA DE AUTOVILES CADIZ S.A.", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8902003335", "EMPRESA DE TRANSPORTE FLOTA CACHIRA LTDA", "EMPRESA DE TRANSPORTE FLOTA CACHIRA LTDA", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8902003351", "EMPRESA DE TRANSPORTES LUSITANIA S A", "EMPRESA DE TRANSPORTES LUSITANIA S A", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8902038426", "RADIO TAX S.A.", "RADIO TAX S.A.", "Santander", "BUCARAMANGA" ));
        companias.add(new CompaniaTransporte( "8903012964", "EMPRESA DE TRANSPORTES SULTANA DEL VALLE S A.S", "EMPRESA DE TRANSPORTES SULTANA DEL VALLE S A.S", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8903028491", "TRANSPORTES EXPRESO PALMIRA S.A.", "TRANSPORTES EXPRESO PALMIRA S.A.", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "8904004356", "TRANSPORTES MEDIA LUNA S.A.", "TRANSPORTES MEDIA LUNA S.A.", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8904015707", "EMP DE TRANSPORTES RAPIDO EL CARMEN S A", "EMP DE TRANSPORTES RAPIDO EL CARMEN S A", "Bolivar", "CARTAGENA" ));
        companias.add(new CompaniaTransporte( "8905004663", "EXTRA RAPIDO LOS MOTILONES S.A.", "EXTRA RAPIDO LOS MOTILONES S.A.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "8909094599", "SONAR- INVERSIONES EXPRESO MEDELLIN SONSON ARGELIA Y CIA LTDA S.C.A", "SONAR- INVERSIONES EXPRESO MEDELLIN SONSON ARGELIA Y CIA LTDA S.C.A", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909122515", "TRANSPORTES TAMESIS LTDA Y CIA S C A", "TRANSPORTES TAMESIS LTDA Y CIA S C A", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909124496", "TRANSPORTES GUATAPE LA PIEDRA Y CIA LTDA", "TRANSPORTES GUATAPE LA PIEDRA Y CIA LTDA", "Antioquia", "GUATAPE" ));
        companias.add(new CompaniaTransporte( "8909133080", "SURANDINA DE TRANSPORTES S.A.", "SURANDINA DE TRANSPORTES S.A.", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8909400786", "EXPRESO VALPARAISO CARAMANTA S.A.S", "EXPRESO VALPARAISO CARAMANTA S.A.S", "Antioquia", "MEDELLIN" ));
        companias.add(new CompaniaTransporte( "8911007721", "FLOTA HUILA S A", "FLOTA HUILA S A", "Huila", "NEIVA" ));
        companias.add(new CompaniaTransporte( "8911012827", "COOP LABOYANA DE TRANSPORTADORES LTDA. COOTRANSLABOYANA", "COOP LABOYANA DE TRANSPORTADORES LTDA. COOTRANSLABOYANA", "Huila", "PITALITO" ));
        companias.add(new CompaniaTransporte( "8912000359", "EXPRESO SAN JUAN DE PASTO S.A.", "EXPRESO SAN JUAN DE PASTO S.A.", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8912002878", "COOPERATIVA ESPECIALIZADA SUPERTAXIS DEL SUR LTDA", "COOPERATIVA ESPECIALIZADA SUPERTAXIS DEL SUR LTDA", "Narino", "IPIALES" ));
        companias.add(new CompaniaTransporte( "8912003084", "FLOTA GUAITARA S A", "FLOTA GUAITARA S A", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8912007030", "AUTO PANAMERICANO DE TRANSPORTES S. A.", "AUTO PANAMERICANO DE TRANSPORTES S. A.", "Narino", "IPIALES" ));
        companias.add(new CompaniaTransporte( "8912011960", "EXPRESO JUANAMBU S A", "EXPRESO JUANAMBU S A", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8912017873", "TAXIS LA FRONTERA S A", "TAXIS LA FRONTERA S A", "Narino", "IPIALES" ));
        companias.add(new CompaniaTransporte( "8912222731", "RUTAS DEL SUR S A", "RUTAS DEL SUR S A", "Narino", "PASTO" ));
        companias.add(new CompaniaTransporte( "8913004415", "TRANSPORTES GINEBRA S.A.", "TRANSPORTES GINEBRA S.A.", "Valle del Cauca", "GINEBRA" ));
        companias.add(new CompaniaTransporte( "8913016677", "EXPRESO PRADERA PALMIRA LIMITADA", "EXPRESO PRADERA PALMIRA LIMITADA", "Valle del Cauca", "PALMIRA" ));
        companias.add(new CompaniaTransporte( "8914001480", "FLOTA OCCIDENTAL S.A.", "FLOTA OCCIDENTAL S.A.", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "8914003559", "TRANSPORTES FLORIDA S.A.", "TRANSPORTES FLORIDA S.A.", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "8914015345", "TRANSPORTES BATERO S.A.", "TRANSPORTES BATERO S.A.", "Risaralda", "QUINCHIA" ));
        companias.add(new CompaniaTransporte( "8914017477", "TRANSPORTES TATAMA S. A.", "TRANSPORTES TATAMA S. A.", "Risaralda", "SANTUARIO" ));
        companias.add(new CompaniaTransporte( "8914017753", "TRANSPORTES ZAPATA S. A.", "TRANSPORTES ZAPATA S. A.", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "8914079306", "TRANSPORTES APIA S A", "TRANSPORTES APIA S A", "Risaralda", "APIA" ));
        companias.add(new CompaniaTransporte( "8914095169", "EXPRESO ALCALA S A", "EXPRESO ALCALA S A", "Risaralda", "PEREIRA" ));
        companias.add(new CompaniaTransporte( "8918000622", "EL RAPIDO DUITAMA LTDA.", "EL RAPIDO DUITAMA LTDA.", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "8919002026", "NUEVA TRANSNOVITA S.A.", "NUEVA TRANSNOVITA S.A.", "Valle del Cauca", "CARTAGO" ));
        companias.add(new CompaniaTransporte( "8919004251", "EMPRESA DE TRANSPORTES PATUMA LIMITADA", "EMPRESA DE TRANSPORTES PATUMA LIMITADA", "Valle del Cauca", "VERSALLES" ));
        companias.add(new CompaniaTransporte( "8919037091", "TRANSPORTES UNIDOS BUGA S.A.", "TRANSPORTES UNIDOS BUGA S.A.", "Valle del Cauca", "GUADALAJARA DE BUGA" ));
        companias.add(new CompaniaTransporte( "9000819417", "EXPRESO FENIX LTDA.", "EXPRESO FENIX LTDA.", "Cundinamarca", "ZIPAQUIRA" ));
        companias.add(new CompaniaTransporte( "9000981502", "STITANQUES LMITADA", "STITANQUES LMITADA", "Atlantico", "BARRANQUILLA" ));
        companias.add(new CompaniaTransporte( "9002063123", "BERLITUR S. A. S. ", "BERLITUR S. A. S. ", "Bogota D. C.", "BOGOTA" ));
        companias.add(new CompaniaTransporte( "9004550387", "EXPRESO EL CERRITO S.A.S.", "EXPRESO EL CERRITO S.A.S.", "Valle del Cauca", "EL CERRITO" ));
        companias.add(new CompaniaTransporte( "9006385155", "TRANSPORTES LINEAS DEL VALLE S.A.S.", "TRANSPORTES LINEAS DEL VALLE S.A.S.", "Valle del Cauca", "CALI" ));
        companias.add(new CompaniaTransporte( "9009494287", "EXPRESO BARI S.A.S.", "EXPRESO BARI S.A.S.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "9010004019", "CATATUMBO TRAINDLS S.A.S.", "CATATUMBO TRAINDLS S.A.S.", "Norte de Santander", "CUCUTA" ));
        companias.add(new CompaniaTransporte( "9011905232", "PANAMERICANA EXPRESS SAS", "PANAMERICANA EXPRESS SAS", "Cundinamarca", "FUSAGASUGA" ));
                


        return companias;
    
    
    }
}
