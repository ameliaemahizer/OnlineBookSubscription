//package search;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//public class TitleSearch implements SearchBookInterface {
//
//    //@Override
//    public List<BookModel> search(String query, List<BookModel> bookModels) {
//        return bookModels.stream()
//                .filter(bookModel -> bookModel.getTitle().toLowerCase().contains(query.toLowerCase()))
//                .collect(Collectors.toList());
//    }
//}
