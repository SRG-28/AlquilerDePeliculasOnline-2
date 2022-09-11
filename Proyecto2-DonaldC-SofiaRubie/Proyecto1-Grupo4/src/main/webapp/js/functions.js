const API_KEY = 'api_key=1ca720de964a241da44209135bf3ccf7';
const BASE_URL = 'https://api.themoviedb.org/3';
const IMG_URL = 'https://image.tmdb.org/t/p/original';
const searchURL = BASE_URL + '/search/movie?'+API_KEY;
const tagsEl = document.getElementById('tags');
const actor = BASE_URL +'/movie/';
const actor2 = '/casts?' + API_KEY;

//Categorias
//Mejores
const API_URL1 = BASE_URL + '/movie/top_rated?'+API_KEY;
//Populares
const API_URL2 = BASE_URL + '/movie/popular?'+API_KEY;
//Nuevas
const API_URL3 = BASE_URL + '/movie/upcoming?'+API_KEY;


function setGenre() {
    tagsEl.innerHTML= '';
    genres.forEach(genre => {
        const t = document.createElement('div');
        t.classList.add('tag');
        t.id=genre.id;
        t.innerText = genre.name;
        t.addEventListener('click', () => {
            if(selectedGenre.length == 0){
                selectedGenre.push(genre.id);
            }else{
                if(selectedGenre.includes(genre.id)){
                    selectedGenre.forEach((id, idx) => {
                        if(id == genre.id){
                            selectedGenre.splice(idx, 1);
                        }
                    })
                }else{
                    selectedGenre.push(genre.id);
                }
            }
        })
        tagsEl.append(t);
    })
}



getMovies(API_URL1);

function getMovies(url) {
    lastUrl = url;
    fetch(url).then(res => res.json()).then(data => {
        console.log(data.results)
        if(data.results.length !== 0){
            showMovies(data.results);
            tagsEl.scrollIntoView({behavior : 'smooth'})
        }else{
            main.innerHTML= `<h1 class="no-results">No Results Found</h1>`
        }
    })
}



function showMovies(data) {
    main.innerHTML = '';
    data.forEach(movie => {
        const {title, poster_path, vote_average, overview, id,release_date, genre_ids} = movie;
        let genero = genre_ids.toString();
        //Generos
        let g12 = genero.search("12")
        if (g12 != -1){
            genero = "12-Adventure";
        }
        let g16 = genero.search("16")
        if (g16 != -1){
            genero = "16-Animado";
        }
        let g28 = genero.search("28")
        if (g28 != -1){
            genero = "28-Acción";
        }
        let g10752 = genero.search("10752")
        if (g10752 != -1){
            genero = "10752-Guerra";
        }
        let g9648 = genero.search("9648")
        if (g9648 != -1){
            genero = "9648-Misterio";
        }
        let g53 = genero.search("53")
        if (g53 != -1){
            genero = "53-Novela de suspenso ";
        }
        let g18 = genero.search("18")
        if (g18 != -1){
            genero = "18-Drama";
        }
        let g10749 = genero.search("10749")
        if (g10749 != -1){
            genero = "10749-Romance";
        }
        let g99 = genero.search("99")
        if (g99 != -1){
            genero = "99-Documental";
        }
        let g10751 = genero.search("10751")
        if (g10751 != -1){
            genero = "10751-Familiar";
        }
        let g35 = genero.search("35")
        if (g35 != -1){
            genero = "35-Comedia";
        }
        let g14 = genero.search("14")
        if (g14 != -1){
            genero = "14-fantasy";
        }
        let g27 = genero.search("27")
        if (g27 != -1){
            genero = "27-Horror";
        }
        let g80 = genero.search("80")
        if (g80 != -1){
            genero = "80-Crime";
        }
        let g37 = genero.search("37")
        if (g37 != -1){
            genero = "37-Occidental";
        }

        const movieEl = document.createElement('div');
        movieEl.classList.add('movie');
        movieEl.innerHTML = `
             <img src="${poster_path? IMG_URL+poster_path: "http://via.placeholder.com/1080x1580" }" alt="${title}">
            <div class="movie-info">
                <h3>${title}</h3>
                <span class="${(vote_average)}">${vote_average}</span>
            </div>
            <div class="overview">
                <h3>Resumen</h3>
                ${overview}
                <br/> 
                <h3>Fecha de estreno</h3>
                ${release_date} 
                <br>
                <h3>Genero</h3>
                ${genero} 
                <br>
               <h3>Precio</h3>
                Compra: $USD 4.99
                Renta:  $USD 1.99
                <h3>Reparto</h3>
                Gwyneth Paltrow,
                Chris Martin,
                Lucía Dominguín Bosé,
                Stephen Tyler,
                Paz Vega,
                Heidi Klum.
                <br>
                <button class="know-more" id="${id}">Know More</button
                <li> <a href="solicitud.jsp" style="color:red"> COMPRAR</a> </li> 
                <li> <a href="carrito.jsp" style="color:limegreen" >COMPRAR(USUARIO REGISTRADO) </a> </li> 
            </div>
    `
        main.appendChild(movieEl);
        document.getElementById(id).addEventListener('click', () => {
            console.log(id)
            openNav(movie)
        })
    })
}
//URL


if(document.querySelector('#container-slider')){
    setInterval('fntExecuteSlide("next")',5000);
}
//------------------------------ LIST SLIDER -------------------------
if(document.querySelector('.listslider')){
    let link = document.querySelectorAll(".listslider li a");
    link.forEach(function(link) {
        link.addEventListener('click', function(e){
            e.preventDefault();
            let item = this.getAttribute('itlist');
            let arrItem = item.split("_");
            fntExecuteSlide(arrItem[1]);
            return false;
        });
    });
}

function fntExecuteSlide(side){
    let parentTarget = document.getElementById('slider');
    let elements = parentTarget.getElementsByTagName('li');
    let curElement, nextElement;

    for(var i=0; i<elements.length;i++){

        if(elements[i].style.opacity==1){
            curElement = i;
            break;
        }
    }
    if(side == 'prev' || side == 'next'){

        if(side=="prev"){
            nextElement = (curElement == 0)?elements.length -1:curElement -1;
        }else{
            nextElement = (curElement == elements.length -1)?0:curElement +1;
        }
    }else{
        nextElement = side;
        side = (curElement > nextElement)?'prev':'next';

    }
    //RESALTA LOS PUNTOS
    let elementSel = document.getElementsByClassName("listslider")[0].getElementsByTagName("a");
    elementSel[curElement].classList.remove("item-select-slid");
    elementSel[nextElement].classList.add("item-select-slid");
    elements[curElement].style.opacity=0;
    elements[curElement].style.zIndex =0;
    elements[nextElement].style.opacity=1;
    elements[nextElement].style.zIndex =1;
}

//------------------------------ FIN CARRUZEL IMG -------------------------

//------------------------------ Expresiones regulares ------------------------
function validarTodo(){
    if(!correo(document.getElementById("correo").value)){
        return false;
    }
    return true;
}

function correo(campo){
    correo = campo.value;
    if( /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/ == correo){
        alert("Correo correcto");
        return true;
    }
    return false;
}

//------------------------------ Compra ------------------------
function validarCompra(){
    if(!codigo(document.getElementById("codigo").value)){
        return false;
    }
    return true;
}

function codigo(campo){
    codigo = campo.value;
    if( codigo.length >= 3){
        alert("Codigo de seguridad correcto");
        return true;
    }
    return false;
}

//------------------------------ Catálogo ------------------------

const grid = new Muuri('.grid',  {
    layout:{
        rounding: false
    }
});

window.addEventListener('load', () => {
    grid.refreshItems().layout();
    document.getElementById('grid').classList.add('imagenes-cargadas');

    // Agregamos los listener de los enlaces para filtrar por categoria.
    const enlaces = document.querySelectorAll('#categorias a');
    enlaces.forEach((elemento) => {
        elemento.addEventListener('click', (evento) => {
            evento.preventDefault();
            enlaces.forEach((enlace) => enlace.classList.remove('activo'));//------------------------------ Quita los que han sido seleccionados anteriormente ------------------------
            evento.target.classList.add('activo');//------------------------------ Trae el nombre de la categoria seleccionada al dar click ------------------------
//------------------------------ Filtrar las categorias del catálogo ------------------------
            const categoria = evento.target.innerHTML.toLowerCase();
            categoria === 'todos' ? grid.filter('[data-categoria]') : grid.filter(`[data-categoria="${categoria}"]`);
        });
    });
});

// Listener para las imagenes
const overlay = document.getElementById('overlay');
document.querySelectorAll('.grid .item img').forEach((elemento) => {
    elemento.addEventListener('click', () => {
        const ruta = elemento.getAttribute('src');
        const descripcion = elemento.parentNode.parentNode.dataset.descripcion;

        overlay.classList.add('activo');
        document.querySelector('#overlay img').src = ruta;
        document.querySelector('#overlay .descripcionPeli').innerHTML = descripcion;
    });
});

// Eventlistener del boton de cerrar
document.querySelector('#btn-cerrar-popup').addEventListener('click', () => {
    overlay.classList.remove('activo');
});

// Eventlistener del overlay
overlay.addEventListener('click', (evento) => {
    evento.target.id === 'overlay' ? overlay.classList.remove('activo') : '';
});


//Geolocalazación
function initMap(){
    var latlng = {lat: 9.938563, lng: -84.107312}

    var map = new google.maps.Map(document.getElementById("map") , {
        zoom: 12,
        center: latlng
    });
}




function Peli(){
    var elemento = document.getElementById("item");

    var name = elemento.dataset.etiquetas.value;
    document.getElementById("nombre").value = name;
}

function ocultarBotones(){
    if(Username==null){

    }
}

