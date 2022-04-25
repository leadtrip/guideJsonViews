package guidejsonviews

import demo.Artist

class BootStrap {

    def init = { servletContext ->
        def riverside = new Artist(name: 'Riverside')
        riverside.addToAlbums(title: 'Love, Fear and the time machine')
        riverside.addToAlbums(title: 'Anno Domini high definition')
        riverside.save( failOnError:true)

        def davidBowie = new Artist(name: 'David Bowie')
        davidBowie.addToAlbums(title: 'Space Oddity')
        davidBowie.addToAlbums(title: 'Heroes')
        davidBowie.save( failOnError:true)

        def gnr = new Artist(name: 'Guns n Roses')
        gnr.addToAlbums(title: 'Welcome to the jungle')
        gnr.addToAlbums(title: 'The spaghetti incident')
        gnr.save( failOnError:true)
    }
    def destroy = {
    }
}
