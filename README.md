# Stock_MVC_DAO
Perfetto sia dal punto di vista DAO che dal punto di vista MVC.

-View si occupa solo di mostrare controlli (qua non applicabile perche' interfaccia testuale), mostrare eventuali avvisi, leggere input dell'utente e mostrare i dati.

-Model si occupa solo del modello dati concettuale, la gestione dell'archiviazione avverrà invece ad opera del DAO.

-Controller si occupa di interagire con l'utente per tramite della View (legge valori, mostra valori) interfacciandosi con la base di dati tramite il Model (DAO).
