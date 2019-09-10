package com.julio.equiposapp.modelo;

import com.julio.equiposapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquiposContent {

    public static final List<EquipoItem> ITEMS = new ArrayList<>();

    static{

        ITEMS.add(new EquipoItem("Athletic de Bilbao"," El Athletic Club es un club de fútbol de la villa de Bilbao, País Vasco, España. Fue fundado en 1898 y es, junto al Real Madrid Club de Fútbol y al Fútbol Club Barcelona, el único club que ha disputado todas las ediciones de la Primera División de España desde su creación en 1928. A su vez, es uno de los cuatro únicos clubes profesionales de España que no es una sociedad anónima deportiva, de manera que la propiedad del club recae en sus socios. Se lo conoce ampliamente como Athletic de Bilbao, y en algunas ocasiones con el nombre de la ciudad, Bilbao, o incluso como Atlético de Bilbao.", R.drawable.athletic_bilbao));
        ITEMS.add(new EquipoItem("Atlético de Madrid"," El Club Atlético de Madrid es el tercer club español con más títulos oficiales de fútbol, habiendo logrado siete títulos internacionales (una Copa Intercontinental, una Recopa de Europa, dos Ligas Europeas de la UEFA, dos Supercopas de Europay una Intertoto) y veinticuatro nacionales (diez Ligas, diez Copas del Rey y una Supercopa de España, junto a tres títulos antecesores de esta última). Tras ganar la Liga 2013/14 se encuentra situado en la cuarta posición de la clasificación histórica de la Primera División Española.",R.drawable.atletico_madrid));
        ITEMS.add(new EquipoItem("Barcelona","        <item>El Fútbol Club Barcelona es una entidad polideportiva de Barcelona (España). Fue fundado como club de fútbol el 29 de noviembre de 1899 por doce jóvenes futbolistas aficionados, liderados por el suizo Hans Gamper. El F. C. Barcelona es conocido popularmente como Barça (abreviación de la pronunciación de Barcelona en catalán central) y sus fanes comoculés (pronunciación del catalán culers).</item>\n", R.drawable.barcelona));
        ITEMS.add(new EquipoItem("Betis","        <item>El Real Betis Balompié o también conocido simplemente como Real Betis o también como Betis, es un club de fútbol de la ciudad de Sevilla. Milita en la Segunda División de España. Sus máximos galardones son un título de Liga y dos Copas del Rey. Fue el primer equipo andaluz que jugó en Primera División, que ganó la Liga española, que ganó la Copa del Rey en su actual formato, el primero en jugar en la Liga de Campeones de la UEFA y que jugó una final de competición internacional, la Copa Ibérica frente a Oporto y el Torneo de Campeones Latinos frente a Juventus, Oporto y Sochaux, ambos en 1935 como vigente campeón de Liga.</item>\n", R.drawable.betis));
        ITEMS.add(new EquipoItem("Celta de Vigo","        <item>El Real Club Celta de Vigo S. A. D. es un club de fútbol que actualmente juega en la Primera División de España. Fue fundado en Vigo en 1923 a partir de la fusión del Vigo Sporting y el Real Fortuna. El club disputa sus partidos como local en el estadio de Balaídos, con capacidad para 29 000 espectadores e inaugurado en 1928. El Celta ocupa la duodécima plaza en la clasificación histórica de la LFP.</item>\n", R.drawable.celta_vigo));
        ITEMS.add(new EquipoItem("Deportivo","        <item>El Real Club Deportivo de La Coruña S.A.D. es un club de fútbol español de la ciudad de La Coruña, Galicia, España. Fue fundado en 1906 y actualmente juega en la Primera División de España.Es el noveno club español en conseguir un título de Liga (entre los 60 equipos que en algún momento han alcanzado la máxima categoría), a lo que hay que sumar dos Copas del Rey y tres Supercopas de España. Popularmente se le conoce con el apodo de Dépor o Deportivo y a sus aficionados, deportivistas.</item>\n", R.drawable.deportivo));
        ITEMS.add(new EquipoItem("Espanyol","        <item>El Real Club Deportivo Español (oficialmente Real Club Deportivo Espanyol de Barcelona S. A. D.) es un club de fútbol español que juega en la Primera División. Fue fundado el 28 de octubre de 1900 por un grupo de universitarios españoles que estaban estudiando en la Universidad de Barcelona y cuyo primer presidente fue Ángel Rodríguez Ruiz. Nació bajo el nombre de Sociedad Española de Football debido a que todos sus componentes eran catalanes o de otros lugares de España, en contraposición con algunos equipos que se componían de varios jugadores extranjeros, como era el caso del Fútbol Club Barcelona. </item>\n",R.drawable.espanyol));
        ITEMS.add(new EquipoItem("Getafe","        <item>El Getafe Club de Fútbol es un club de fútbol de España de la ciudad de Getafe en la Comunidad de Madrid. Fue fundado el 8 de julio de 1983 (el 24 de febrero de 1946 como Club Getafe Deportivo) y juega en la Primera División de España. Es el 58º equipo en incorporarse a Primera División siendo su primera participación la temporada 2004/05 y en la  clasificación histórica de 1.ª División en junio de 2013 ocupa el puesto 28º.</item>\n",R.drawable.getafe));
        ITEMS.add(new EquipoItem("Granada","        <item>El Granada Club de Fútbol es una sociedad anónima deportiva de la ciudad española de Granada. Como club de fútbol fue fundado el 6 de abril de 1931 y actualmente milita en la Primera División de España. El Granada C.F. se encuentra en la posición 23 de la clasificación histórica por puntos de la Primera División, en la que ha participado en 20 temporadas y ha conseguido el 6º puesto en dos ocasiones. Además ha sido subcampeón de la Copa del Rey.</item>\n",R.drawable.granada));
        ITEMS.add(new EquipoItem("Levante","        <item>El Levante Unión Deportiva (también llamado Llevant Unió Esportiva, en valenciano) es un club de fútbol de España. En 1909 se fundan el Gimnástico Fútbol Club y el Levante Fútbol Club, coincidiendo con la fundación de la Federación Valenciana de Fútbol. Ambos se fusionaron en 1939 con el nombre de Unión Deportiva Levante-Gimnástico, pasando a denominarse Levante Unión Deportiva en 1941. El equipo toma el nombre de la Playa de Levante, donde estaba ubicado su campo de juego a principios del siglo XX.</item>\n",R.drawable.levante));
        ITEMS.add(new EquipoItem("Málaga","        <item>El Málaga Club de Fútbol es un club de fútbol profesional de la ciudad española de Málaga. Milita en la Primera División de España, denominada oficialmente Liga BBVA. Su propietario es el jeque catarí Abdullah ben Nasser Al Thani, siendo el primer jeque en convertirse en máximo accionista de un club de fútbol español.</item>\n",R.drawable.malaga));
        ITEMS.add(new EquipoItem("Mallorca","        <item>El Real Club Deportivo Mallorca es un club de fútbol de España, instalado en la ciudad de Palma de Mallorca en las Islas Baleares en el Estadio de Son Moix, conocido también por motivos de patrocinio como Iberostar Estadio. Fue fundado en 1916 y juega actualmente en la Segunda División de España.</item>\n",R.drawable.mallorca));
        ITEMS.add(new EquipoItem("Osasuna","        <item>El Club Atlético Osasuna es un club de fútbol de Pamplona (Navarra, España). El equipo, en la actualidad, juega en la Segunda División de España. Fue fundado el 17 de noviembre de 1920, fruto de la fusión de dos clubes de la ciudad: el Sportiva y el New Club.</item>\n", R.drawable.osasuna));
        ITEMS.add(new EquipoItem("Rayo Vallecano","        <item>El Rayo Vallecano de Madrid es una entidad deportiva, centrada en el ámbito futbolístico, localizada en el distrito de Puente de Vallecas, al sureste de la capital de España, Madrid. El club fue fundado el 29 de mayo de 1924 y actualmente su primer equipo juega en la Primera División de España. El Rayo Vallecano se sitúa en el puesto número 119 del ranking de clubes de la FIFA con 4450 puntos.</item>\n",R.drawable.rayo_vallecano));
        ITEMS.add(new EquipoItem("Real Madrid","        <item>El Real Madrid Club de Fútbol, mejor conocido como Real Madrid, es una entidad polideportiva con sede en Madrid, España. Fue fundado oficialmente como un club de fútbol el 6 de marzo de 1902 por los hermanos barceloneses Juan y Carlos Padrós bajo el nombre de (Sociedad) Madrid Foot-ball Club.</item>\n",R.drawable.real_madrid));
        ITEMS.add(new EquipoItem("Real Sociedad","        <item>La Real Sociedad de Fútbol (S. A. D.) es un club de fútbol de España, establecido en la ciudad de San Sebastián (Guipúzcoa), que juega en la Primera División.2 Tiene una muy larga trayectoria en la historia del balompié español y es uno de los únicos nueve equipos históricos que nunca han competido en división inferior a la Segunda División.</item>\n", R.drawable.real_sociedad));
        ITEMS.add(new EquipoItem("Sevilla","        <item>El Sevilla Fútbol Club es un club de fútbol español organizado como sociedad anónima deportiva. Tiene su sede en Sevilla, capital de la comunidad autónoma de Andalucía, y actualmente juega en Primera División. Sus estatutos fueron creados el 25 de enero de 1890 y aprobados el 14 de octubre de 1905, siendo su primer presidente el jerezano José Luis Gallegos Arnosa.</item>\n",R.drawable.sevilla));
        ITEMS.add(new EquipoItem("Valencia","        <item>El Valencia Club de Fútbol es una sociedad anónima deportiva con sede en la ciudad de Valencia, España. El club de fútbol fue fundado el 18 de marzo de 1919. Su primera plantilla juega actualmente en la Primera División de España y disputa los encuentros como local en el Estadio de Mestalla, con una capacidad para 55.000 espectadores.</item>\n",R.drawable.valencia));
        ITEMS.add(new EquipoItem("Valladolid","        <item>El Real Valladolid Club de Fútbol es un club de fútbol español organizado como sociedad anónima deportiva de la ciudad de Valladolid, en la comunidad autónoma de Castilla y León, y que en la temporada 2014/15 militará en Segunda División. Fue fundado el 20 de junio de 1928, fruto de la fusión de los dos clubes más importantes de la ciudad, el Club Deportivo Español y la Real Unión Deportiva.</item>\n",R.drawable.valladolid));
        ITEMS.add(new EquipoItem("Zaragoza","        <item>El Real Zaragoza es un club de fútbol profesional español de la ciudad de Zaragoza, en Aragón, que milita en la Segunda División de España, fue fundado en 1932 con la unión del Iberia Sport Club y del Zaragoza Club Deportivo, los dos clubes más importantes de la ciudad. El origen se encuentra en 1903 con la creación del Zaragoza Foot-Ball Club, antecesor del Real Zaragoza.</item>\n",R.drawable.zaragoza));

        //ITEM_MAP.put("1",)
    }
    public static class EquipoItem {

        public final String nombreEquipo;
        public final String descripcion;
        public final int imagenEquipo;

        public EquipoItem(String nombreEquipo, String descripcion, int imagenEquipo) {

            this.nombreEquipo = nombreEquipo;
            this.descripcion = descripcion;
            this.imagenEquipo = imagenEquipo;
        }

        @Override
        public String toString(){
            return nombreEquipo;
        }
    }
}
