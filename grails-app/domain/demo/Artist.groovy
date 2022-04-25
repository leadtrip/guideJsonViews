package demo

import grails.rest.Resource

@Resource(uri = '/artists', formats = ['json', 'xml'])
class Artist {
    String name
    static hasMany = [albums: Album]
}
