Per il progetto "CATALOGO BIBLIOGRAFICO", ho creato le seguenti entità:
Documento --> libri = OneToMany
Documento --> riviste = OneToMany

Utente --> Prestito = OneToMany
Utente --> riviste = OneToMany
Utente --> libri = OneToMany

Ho scelto un interazione di tipo JOIN per documento padre e i suoi figli libri e riviste.
abstract documento --> figli libri e riviste


