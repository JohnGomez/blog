<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="templates/head.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-lg-8" style="padding-left: 5%">
                    <img src="http://mscmariotti.pro.br/wp-content/uploads/2015/05/product-development-using-java.jpg" />
                </div>
                <div class="col-lg-4">
                    <form action="login" style="padding-top: 25%;" method="POST">
                        <h2>login</h2>
                        Login:
                        <input type="text" class="form-control" name="login" />
                        Senha:
                        <input type="password" class="form-control" name="senha" />
                        <br/>
                        <button class="btn btn-primary" >Entrar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
