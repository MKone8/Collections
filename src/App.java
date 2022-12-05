import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.transform.Source;

public class App {
    public static void main(String[] args){

        mapToList((lessThanSixOut(listToMap(modifyList(createListOfColors())))));

        }
        public static List<String> createListOfColors(){
            List<String>listOfColors = new ArrayList<>(Arrays.asList("pomarańczowy","czerwony","zielony","brązowy","niebieski","żółty","neonowy","burgundowy"));      
            listOfColors.add("różowy");
            listOfColors.add("czarny");
            return listOfColors;

        }

        public static List<String> modifyList(List<String> listOfColors){
     
            if(listOfColors.size()==10){
                for(String colour : listOfColors){
                    if (colour.charAt(0)=='n'){ 
                        listOfColors.set(listOfColors.indexOf(colour),"jasny "+colour);
                    }else if (colour.charAt(0)=='c'){
                        listOfColors.set(listOfColors.indexOf(colour), "bardzo "+colour);
                    }
                }   
                listOfColors.removeIf("pomarańczowy"::equals);
                listOfColors.add(2, "lazurowy");
                return listOfColors;
                     
            }
            return null;
            
            }
            public static Map<Integer,String> listToMap(List<String> listOfColors){
            if(!listOfColors.isEmpty()){
                Map<Integer,String>mapOfColors = new HashMap<Integer,String>();
                for(String colour : listOfColors){
                    mapOfColors.put(listOfColors.indexOf(colour),colour);
                }            
                return mapOfColors;
            }   return null;
            }


            public static boolean ifGreen(Map<Integer,String>mapOfColors){
                for (Map.Entry<Integer,String> colorCheck : mapOfColors.entrySet()){
                    if((colorCheck.getKey()%2==0)&&colorCheck.getValue().equals("zielony")){
                    return true; 
                    }                 
                } return false;
            }

            public static Map<Integer,String> lessThanSixOut(Map<Integer,String>mapOfColors){
                        mapOfColors.values().removeIf(value -> value.length()<=6);                     
                        return mapOfColors;
            };

            public static void mapToList(Map<Integer,String>mapOfColors){
                List<String>definitiveList = new ArrayList<>();
                    for(Map.Entry<Integer,String> mapElement : mapOfColors.entrySet()){
                        definitiveList.add(mapElement.getValue());
                    }
                System.out.println(definitiveList);
            }
                                
    }


        
    

