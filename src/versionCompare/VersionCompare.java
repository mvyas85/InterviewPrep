package versionCompare;
public class VersionCompare {

	public static void main(String args[]) {
		System.out.println(compareVersion("0.1","1.0"));
	}
    public static int compareVersion(String version1, String version2) {
  //TODO trim leading zeros or trailing . and 0
        
        version1 = version1.replaceFirst("^0*","");
        if (version1.isEmpty()) version1 = "0";
        version2 = version2.replaceFirst("^0*","");
        if (version2.isEmpty()) version2 = "0";
        
        if(version1.equals(version2)){return 0;}
        
        String[] versionA = version1.split("\\.");
        String[] versionB = version2.split("\\.");
        
        String[] smallLen = versionA.length < versionB.length ? versionA : versionB;
        
        boolean isAGreater = false;
        for(int i =0;i<smallLen.length;i++){
            int a = Integer.parseInt(versionA[i]);
            int b = Integer.parseInt(versionB[i]);
            if(a>b){
                return 1;
            }else if(a<b){
                return -1;
            }else{
                continue;
            }
        }
        
        return smallLen == versionA ? -1:1;
    }
}
