package com.mero.wyt_register.activity;

import android.content.Context;
import android.util.Log;

import com.mero.wyt_register.utils.AppUtils;

import java.text.DecimalFormat;
import java.util.Random;

import static com.amap.loc.c.h;
import static com.mero.wyt_register.utils.AppUtils.getDispalyMetrics;

/**
 * Created by chenlei on 2016/10/25.
 */

public final  class DeviceInfoGetRandom {

    //随机android_id
    public static  String  getIMEI(){
        String imei = "";
        String tac = "";//前8位
        Random random =new Random();
        //TAC码 这里适配44个
        int i =  random.nextInt(44);
        StringBuffer sb =new StringBuffer("");
        switch (i){
            case 0:
                //海信HS-XHS-X8C
                tac= "86415302";
                break;
            case 1:
//                海信HS-I630T
                tac = "86505012";
                break;
            case 2:
//                HTC M8d
                tac = "35156506";
                break;
            case 3:
//               HTC d816v
                tac = "35302506";
                break;
            case 4:
//               HTC M8Sd
                tac = "35282506";
                break;
            case 5:
//               中兴 Q801L
                tac = "86392002";
                break;
            case 6:
//               中兴 G717C
                tac = "86230702";
                break;
            case 7:
//               中兴 G718C
                tac = "86392002";
                break;
            case 8:
//               中兴 M901C
                tac = "86391402";
                break;
            case 9:
//               中兴 Q802C
                tac = "86392002";
                break;
            case 10:
//               中兴Q208D
                tac = "86553802";
                break;
            case 11:
//               中兴MF90C1
                tac ="86405102";
                break;
            case 12:
//              中兴 MF825C
                tac = "86393602";
                break;
            case 13:
//               TCL S850L
                tac = "86315702";
                break;
            case 14:
//               TCL J929L
                tac = "86386502";
                break;
            case 15:
//               TCL J736L
                tac = "86433002";
                break;
            case 16:
//               TCL P688L
                tac = "86538602";
                break;
            case 17:
//               TCL P520L
                tac = "86559202";
                break;
            case 18:
//               TCL OT-W800O(CN)
                tac = "86246802";
                break;
            case 19:
//               LG D859
                tac = "35417106";
                break;
            case 20:
//               LG D729
                tac = "35417806";
                break;
            case 21:
//              联想 S860e
                tac = "86453502";
                break;
            case 22:
//               华为 EC3372-871
                tac = "86383902";
                break;
            case 23:
//              华为 EC5377
                tac ="86403502";
                break;
            case 24:
//               华为B880-65
                tac = "86269702";
                break;
            case 25:
//               华为 C8817E
                tac = "86524302";
                break;
            case 26:
//               华为C199
                tac = "86534302";
                break;
            case 27:
//               华为 C8817L
                tac = "86403602";
                break;
            case 28:
//               三星N7509V
                tac = "35220806";
                break;
            case 29:
//               三星G9009W
                tac = "35220906";
                break;
            case 30:
//               三星G3589W
                tac = "35357206";
                break;
            case 31:
//               宇龙Coolpad 9190L
                tac = "86350802";
                break;
            case 32:
//              宇龙 Coolpad 5892_C00
                tac = "86409702";
                break;
            case 33:
//               宇龙Coolpad T1
                tac = "86522002";
                break;
            case 34:
//               贝尔丰 BF T12
                tac = "86763200";
                break;
            case 35:
//               华为 Che2-TL00M
                tac = "86764002";
                break;
            case 36:
//               步步高VIVO X5S L
                tac = "86765002";
                break;
            case 37:
//              迪美 DIM G4
                tac= "86859600";
                break;
            case 38:
//               欧博信OPSSON Q9
                tac = "86922501";
                break;
            case 39:
//               华为 G620-L75
                tac = "86925701";
                break;
            case 40:
//               华为G620-L75
                tac ="86927501";
                break;
            case 41:
//               夏新L855
                tac = "86932401";
                break;
            case 42:
//               欧新K-II
                tac = "86988801";
                break;
            case 43:
//              TLC  P728M
                tac = "88887777";
                break;
        }
        sb.append(tac);
        //FAC码12个，所以需要13个随机数字
        String fac = "";
        int f = random.nextInt(13);
        switch (f){
            case 0:
                //代表生产地为芬兰
                fac = "10";
                break;
            case 1:
                //代表生成地为德国
                fac = "20";
                break;
            case 2:
                //代表生产地为韩国
                fac = "30";
                break;
            case 3:
                //代表生产地为北京
                fac = "40";
                break;
            case 4:
                //代表生产地为北京
                fac = "62";
                break;
            case 5:
                //代表生产地为东莞
                fac = "60";
                break;
            case 6:
                //代表生产地阿拉伯生产
                fac = "02";
                break;
            case 7:
                //代表生产地为德国
                fac = "08";
                break;
            case 8:
                //代表生产地为德国
                fac = "80";
                break;
            case 9:
                //代表生产地为芬兰
                fac = "01";
                break;
            case 10:
                //代表生产地为芬兰
                fac = "10";
                break;
            case 11:
                //代表生产地为阿赛拜疆
                fac = "13";
                break;
            case 12:
                //代表生产地为原地
                fac = "00";
                break;
        }
        sb.append(fac);
        //SNR码
        for(int j=0;j<6;j++){
            sb.append(random.nextInt(10)+"");
        }
        //sp标志位
        String sp = 0+"";
        imei = sb.toString();
        return imei;
    }


    //得到屏幕分辨率
    public static String  getRandomFenbianlvData(Context context){
        int[] wh = AppUtils.getDispalyMetrics(context);
        String fenbianlv = "";
        int r = new Random().nextInt(10)+1;
        wh[0]+=r;
        wh[1]+=r;
        fenbianlv = wh[0]+"x"+wh[1];
        return fenbianlv;
    }

    //得到IMSI
    public static String getIMSI(){
        StringBuffer sb =new StringBuffer("");
        String imsi = "";
        Random random =new Random();
        //MCC+MNC前5位
        String mccnc = "";
        int i = random.nextInt(8);
        switch (i){
            case 0:
                //中国移动
                mccnc = "46000";
                break;
            case 1:
                //中国移动
                mccnc = "46002";
                break;
            case 2:
                //中国移动
                mccnc = "46007";
                break;
            case 3:
                //中国联通
                mccnc = "46001";
                break;
            case 4:
                //中国联通
                mccnc = "46006";
                break;
            case 5:
                //中国电信
                mccnc = "46003";
                break;
            case 6:
                //中国电信
                mccnc = "46005";
                break;
            case 7:
                //中国铁通
                mccnc = "46020";
                break;
        }
        sb.append(mccnc);
        //后十位MSIN
        //中间五位
        for(int j=0;j<5;j++){
            sb.append(random.nextInt(10)+"");
        }
        //后面五位
        for(int j =0;j<5;j++){
            sb.append(random.nextInt(10)+"");
        }
        imsi = sb.toString();
        return  imsi;
    }

    //得到Mac地址
    private final static int MAX_COMPANY_LIST_LEN = 1200;
    private final static String companyListString = "00000C#00000E#000075#000095#0000F0#000102#000103#000130#000142#000143#00014A#000163#000164#000181#000196#000197#0001C7#0001C9#0001E6#0001E7#000216#000217#00024A#00024B#00025F#000278#00027D#00027E#0002A5#0002B3#0002B9#0002BA#0002DC#0002EE#0002FC#0002FD#000331#000332#000342#000347#00034B#00036B#00036C#00037F#000393#00039F#0003A0#0003E3#0003E4#0003FE#00040B#00041F#000423#000427#000428#000438#00044D#00044E#000456#00045A#00046B#00046D#00046E#000480#000496#00049A#00049B#0004BD#0004C0#0004C1#0004DC#0004DD#0004DE#0004E2#0004EA#000500#000501#000502#00051A#000531#000532#00055D#00055E#00055F#000573#000574#000585#00059A#00059B#0005B5#0005DC#0005DD#000625#000628#00062A#000652#000653#00065B#00067C#00068C#0006C1#0006D6#0006D7#00070D#00070E#00074D#00074F#000750#000772#000784#000785#0007B3#0007B4#0007E0#0007E9#0007EB#0007EC#000802#00080E#000820#000821#000874#00087C#00087D#000883#00089A#0008A3#0008A4#0008C2#0008C7#0008E2#0008E3#000911#000912#000918#000943#000944#00097B#00097C#000997#0009B6#0009B7#0009E8#0009E9#000A04#000A27#000A28#000A41#000A42#000A57#000A5E#000A8A#000A8B#000A95#000AB7#000AB8#000AD9#000AE0#000AF3#000AF4#000AF7#000B06#000B0E#000B45#000B46#000B5D#000B5F#000B60#000B85#000B86#000BAC#000BBE#000BBF#000BC5#000BCD#000BDB#000BE1#000BFC#000BFD#000C30#000C31#000C41#000C43#000C85#000C86#000CCE#000CCF#000CDB#000CE5#000CE6#000CF1#000CF7#000CF8#000D0B#000D28#000D29#000D54#000D56#000D57#000D65#000D66#000D88#000D93#000D9D#000DAE#000DBC#000DBD#000DE5#000DEC#000DED#000E07#000E08#000E0C#000E35#000E38#000E39#000E40#000E5C#000E62#000E6A#000E7F#000E83#000E84#000E86#000EB3#000EC0#000EC7#000ED6#000ED7#000EED#000F06#000F20#000F23#000F24#000F34#000F35#000F3D#000F61#000F62#000F66#000F6A#000F8F#000F90#000F9F#000FB5#000FBB#000FC3#000FCB#000FCD#000FDE#000FF7#000FF8#001007#00100B#00100D#001011#001014#001018#00101F#001029#00102F#001040#001045#00104B#001054#001055#00105A#001079#00107B#001083#00108C#0010A6#0010B3#0010DB#0010E3#0010F6#0010FA#0010FF#00110A#001111#00111A#001120#001121#001124#00113F#001143#001150#001158#00115C#00115D#001180#001185#00118B#001192#001193#001195#00119F#0011AE#0011BB#0011BC#0011F9#001200#001201#001217#00121E#001225#001237#00123F#001243#001244#001247#00124B#001262#001279#00127F#001280#001283#00128A#0012A9#0012C9#0012D1#0012D2#0012D9#0012DA#0012EE#0012F0#0012F2#0012FB#001302#00130A#001310#001315#001319#00131A#001320#001321#001346#001349#00135F#001360#001365#001370#001371#001372#001374#001377#00137F#001380#001392#0013A9#0013C3#0013C4#0013CE#0013E8#0013F7#0013FD#001404#00140D#00140E#00141B#00141C#001422#001438#00143E#001451#001469#00146A#00146C#00147C#00149A#0014A7#0014A8#0014A9#0014BF#0014C2#0014C7#0014D5#0014E8#0014F1#0014F2#0014F6#001500#001517#00152A#00152B#00152C#00152F#00153F#001540#001560#001562#001563#001570#001599#00159A#00159B#0015A0#0015A8#0015B9#0015C1#0015C5#0015C6#0015C7#0015DE#0015E8#0015E9#0015F9#0015FA#001601#001620#001626#001632#001635#001646#001647#00164D#00164E#001660#00166B#00166C#00166F#001675#001676#00169C#00169D#0016B5#0016B6#0016B8#0016BC#0016C7#0016C8#0016CA#0016CB#0016DB#0016E0#0016EA#0016EB#0016F0#001700#001708#00170E#00170F#00173F#001742#00174B#001759#00175A#001765#00177C#001783#001784#001794#001795#00179A#0017A4#0017B0#0017C9#0017CB#0017CC#0017D1#0017D5#0017DF#0017E0#0017E2#0017E3#0017E4#0017E5#0017E6#0017E7#0017E8#0017E9#0017EA#0017EB#0017EC#0017EE#0017F2#00180F#001813#001818#001819#00182F#001830#001831#001832#001833#001834#001839#001842#00184D#001868#00186E#001871#001873#001874#001882#00188B#00188D#0018A4#0018AF#0018B0#0018B9#0018BA#0018C0#0018C5#0018DE#0018F8#0018FE#001906#001907#00192C#00192D#00192F#001930#001947#00194F#001955#001956#00195B#00195E#001963#001969#001979#00198F#001992#001999#0019A6#0019A9#0019AA#0019B7#0019B9#0019BB#0019C0#0019C5#0019CB#0019D1#0019D2#0019E1#0019E2#0019E3#0019E7#0019E8#001A16#001A1B#001A1E#001A2F#001A30#001A4B#001A66#001A6C#001A6D#001A70#001A75#001A77#001A80#001A89#001A8A#001A8F#001AA0#001AA1#001AA2#001AAD#001AC1#001ADB#001ADC#001ADE#001AE2#001AE3#001AF0#001B0C#001B0D#001B11#001B21#001B25#001B2A#001B2B#001B2F#001B33#001B52#001B53#001B54#001B59#001B63#001B77#001B78#001B8F#001B90#001B98#001BAF#001BBA#001BC0#001BD4#001BD5#001BD7#001BDD#001BE9#001BED#001BEE#001C0E#001C0F#001C10#001C11#001C12#001C17#001C23#001C35#001C43#001C57#001C58#001C8E#001C9A#001C9C#001CA4#001CB0#001CB1#001CB3#001CBF#001CC0#001CC1#001CC4#001CC5#001CD4#001CD6#001CDF#001CEB#001CF0#001CF6#001CF9#001CFB#001D09#001D0D#001D25#001D28#001D2E#001D3B#001D42#001D45#001D46#001D4C#001D4F#001D6B#001D6E#001D70#001D71#001D73#001D7E#001D98#001DA1#001DA2#001DAF#001DB5#001DBA#001DBE#001DE0#001DE1#001DE5#001DE6#001DE9#001DF6#001DFD#001DFE#001E0B#001E10#001E13#001E14#001E1F#001E2A#001E3A#001E3B#001E45#001E46#001E49#001E4A#001E4F#001E52#001E58#001E5A#001E64#001E65#001E67#001E6B#001E79#001E7A#001E7D#001E7E#001E8D#001EA3#001EA4#001EA8#001EBD#001EBE#001EC1#001EC2#001EC9#001ECA#001EDC#001EE1#001EE2#001EE5#001EF6#001EF7#001F00#001F01#001F0A#001F12#001F26#001F27#001F29#001F33#001F3B#001F3C#001F41#001F46#001F5B#001F5C#001F5D#001F6C#001F6D#001F7E#001F9A#001F9D#001F9E#001FA7#001FC4#001FC9#001FCA#001FCC#001FCD#001FDA#001FDE#001FDF#001FE4#001FF3#002032#002040#002060#002075#00207B#0020A6#0020AF#0020D8#0020DA#002105#002108#002109#002119#00211B#00211C#00211E#002129#002135#002136#002143#00214C#002155#002156#002159#00215A#00215C#00215D#002162#00216A#00216B#002170#002180#002191#00219B#00219E#0021A0#0021A1#0021AA#0021AB#0021AE#0021BA#0021BE#0021D1#0021D2#0021D7#0021D8#0021E1#0021E9#0021FC#0021FE#00220C#00220D#002210#002219#00222D#00223A#00223F#002241#002255#002256#002257#002264#002265#002266#002267#00226B#002275#00227F#002283#002290#002291#002298#0022A1#0022A5#0022A6#0022B0#0022B4#0022BD#0022BE#0022CE#0022FA#0022FB#0022FC#0022FD#002304#002305#00230B#00230D#002312#002314#002315#002326#002332#002333#002334#002339#00233A#00233E#002345#00235D#00235E#002368#002369#00236C#002374#002375#00237D#002395#002399#00239C#0023A2#0023A3#0023AB#0023AC#0023AE#0023AF#0023B4#0023BE#0023C2#0023C6#0023D3#0023D4#0023D6#0023D7#0023DF#0023EA#0023EB#0023ED#0023EE#0023F1#0023F8#002400#002401#002403#002404#002413#002414#002436#002437#002438#002443#002450#002451#002454#00246C#002473#00247C#00247D#00247F#002481#002482#00248D#002490#002491#002492#002493#002495#002497#002498#0024A0#0024A1#0024A5#0024B5#0024BA#0024BE#0024C1#0024C3#0024C4#0024D6#0024D7#0024DC#0024E8#0024E9#0024EF#0024F7#0024F9#002500#00252E#002538#002545#002546#002547#002548#00254B#002564#002566#002567#002568#002583#002584#00259C#00259E#0025B3#0025B4#0025B5#0025BA#0025BC#0025BD#0025C3#0025C4#0025CF#0025D0#0025E7#0025F1#0025F2#002608#00260A#00260B#002636#002637#00263E#002641#002642#00264A#002651#002652#002654#002655#00265A#00265D#00265F#002668#002669#002688#002698#002699#0026B0#0026B9#0026BA#0026BB#0026C6#0026C7#0026CA#0026CB#0026CC#0026F3#003005#003019#00301E#003024#003040#003065#00306E#003071#003078#00307B#003080#003085#003094#003096#0030A3#0030B6#0030BD#0030C1#0030F2#004001#00400B#004027#004043#004096#005004#00500B#00500F#005014#00502A#00503E#005043#005050#005053#005054#005073#005080#00508B#005099#0050A2#0050A7#0050BA#0050BD#0050D1#0050DA#0050E2#0050E3#0050E4#0050F0#006008#006009#00602F#006038#00603E#006047#00605C#006070#006083#00608C#006097#0060B0#0060CF#008021#008039#00805F#00809F#0080A0#0080C8#009004#00900C#009021#009027#00902B#00905F#009069#00906D#00906F#009086#00908E#009092#00909C#0090A6#0090AB#0090B1#0090BF#0090CF#0090D9#0090F2#00A024#00A040#00A077#00A081#00A08E#00A0BF#00A0C5#00A0C6#00A0C9#00A0CA#00A0F8#00AA00#00AA01#00AA02#00B04A#00B064#00B08E#00B0C2#00B0D0#00C04F#00C0BE#00C0F9#00D006#00D058#00D063#00D079#00D088#00D090#00D095#00D096#00D097#00D0B7#00D0BA#00D0BB#00D0BC#00D0C0#00D0D3#00D0D8#00D0E4#00D0F6#00D0FF#00E000#00E003#00E00C#00E014#00E01E#00E02B#00E034#00E04F#00E052#00E064#00E06F#00E08F#00E0A3#00E0B0#00E0B1#00E0DA#00E0F7#00E0F9#00E0FC#00E0FE#02608C#02C08C#080007#080009#080028#080046#08004E";
    //调用这个函数即可，传入分隔符“:”
    public static String getMacAddrWithFormat(String in_split) {
        String mac = getCompanyMacAddrPart() + getRandomMacAddrPart();

        String outMac = "";
        for (int i = 0; i < mac.length();) {
            outMac += mac.charAt(i++);

            if (0 == i % 2 && i < mac.length()) {
                outMac += in_split;
            }
        }

        return outMac;
    }

    private static String getCompanyMacAddrPart() {

        String[] compListArray = new String[MAX_COMPANY_LIST_LEN];

        compListArray = companyListString.split("#");

        int index = (int) Math.round(Math.random() * (compListArray.length - 1)
                + 0);

        return compListArray[index];
    }

    private static String getRandomMacAddrPart() {
        String baseMacSeed = "0123456789ABCDEF";

        String wapsMacAddr = "";

        for (int i = 0; i < 3; i++) {
            wapsMacAddr += getRandomByteStr(baseMacSeed);
        }

        return wapsMacAddr;
    }

    private static String getRandomByteStr(String macSeed) {
        int h = (int) Math.round(Math.random() * 15 + 0);
        int l = (int) Math.round(Math.random() * 15 + 0);

        String byteStr = String.format("%c%c", macSeed.charAt(h),
                macSeed.charAt(l));

        return byteStr;
    }




    //得到sim序列号
    public static String getRandomSimNumber(){
        String simNumber = "";
        StringBuffer sb =new StringBuffer("");
        Random random =new Random();
        int s = random.nextInt(3);
        //前6位
        String b = "";
        switch (s){
            case 0:
                //中国移动
                b = "898600";
                break;
            case 1:
                //中国联通
                b = "898601";
                break;
            case 2:
                //中国电信
                b = "898603";
                break;
        }
        sb.append(b);
        for(int j = 0;j<2;j++){
            sb.append(random.nextInt(10)+"");
        }
        //ss位
        sb.append(random.nextInt(3)+"");
        sb.append(random.nextInt(10)+"");

        //第11到19位
        for(int j=0;j<9;j++){
            sb.append(random.nextInt(10)+"");
        }
        //校验位，0或者1
        sb.append("1"+"");
        simNumber = sb.toString();
        return  simNumber;
    }

    //得到SSID，即WiFi名称
    public static String genRandomSsid(int ssid_len){
        //35是因为数组是从0开始的，26个字母+10个数字
        int  maxNum = 36;
        int i;  //生成的随机数
        int count = 0; //生成的长度
        char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        StringBuffer sb = new StringBuffer("");
        Random r = new Random();
        while(count < ssid_len){
            //生成随机数，取绝对值，防止生成负数，

            i = Math.abs(r.nextInt(maxNum));  //生成的数最大为36-1

            if (i >= 0 && i < str.length) {
                sb.append(str[i]);
                count ++;
            }
        }
        return sb.toString();
    }
    /**
     * 返回手机号码
     */
    private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    public static String getPhoneNum() {
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String thrid=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+thrid;
    }
    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /*
    * 得到随机的SDK版本号,9到24
    * */
    public static int getSDK_INT_version(){
        int version = 0;
        version = Integer.valueOf((new Random().nextInt(15)+9));
        return version;
    }
    /*
    * 得到随机的Android版本号
    * */
    public static String getRandomRelease(){
        String release = "";
        int r = new Random().nextInt(16);
        switch (r){
            case 0:
                release = "2.3";
                break;
            case 1:
                release = "2.3.3";
                break;
            case 2:
                release = "3.0";
                break;
            case 3:
                release = "3.1";
                break;
            case 4:
                release = "3.2";
                break;
            case 5:
                release = "4.0";
                break;
            case 6:
                release = "4.0.3";
                break;
            case 7:
                release = "4.1";
                break;
            case 8:
                release = "4.2";
                break;
            case 9:
                release = "4.3";
                break;
            case 10:
                release = "4.4";
                break;
            case 11:
                release = "4.4W";
                break;
            case 12:
                release = "5.0";
                break;
            case 13:
                release = "5.1";
                break;
            case 14:
                release = "6.0";
                break;
            case 15:
                release = "7.0";
                break;
        }
        return release;
    }
}
