(this.webpackJsonpOnlineMusicLibraryFrontend=this.webpackJsonpOnlineMusicLibraryFrontend||[]).push([[0],[,,,,,,,,,,function(e,a,t){e.exports=t.p+"static/media/rodeo.4faccae7.jpg"},function(e,a,t){e.exports=t.p+"static/media/dielit.2be97380.jpg"},function(e,a,t){e.exports=t.p+"static/media/beatles.e648fb53.jpg"},function(e,a,t){e.exports=t.p+"static/media/hendrix.d7d1402f.jpg"},function(e,a,t){e.exports=t(40)},,,,,function(e,a,t){},function(e,a,t){},,,,,,,,,,,,,,,function(e,a,t){},,function(e,a,t){},function(e,a,t){},function(e,a,t){},function(e,a,t){"use strict";t.r(a);var n=t(0),r=t.n(n),s=t(8),i=t.n(s),c=(t(19),t(20),t(2)),l=t(5),m=t.n(l),o=(t(35),t(7)),u=(t(37),function(e){var a=Object(o.a)(),t=a.handleSubmit,n=a.register,s=a.errors;return r.a.createElement("form",{onSubmit:t((function(e){console.log(e)}))},r.a.createElement("div",{className:"login-container"},r.a.createElement("div",{className:"title-container"},r.a.createElement("h1",null,"Sign in")),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{name:"username",ref:n({required:"A username is required",max:20}),placeholder:"username"})),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{type:"password",name:"password",ref:n({required:"A password is required",min:8,max:20}),placeholder:"\u2022\u2022\u2022\u2022\u2022\u2022\u2022\u2022"})),r.a.createElement("div",{className:"submit-btn-group"},r.a.createElement("div",null,r.a.createElement("button",{type:"submit",className:"btn btn-login"},"Sign in"))),r.a.createElement("div",{className:"error-container"},r.a.createElement("p",null,s.username&&s.username.message),r.a.createElement("p",null,s.password&&s.password.message))))}),d=(t(38),function(e){var a=Object(o.a)(),t=a.register,n=a.errors,s=a.getValues,i=a.handleSubmit;return r.a.createElement("form",{onSubmit:i((function(e){console.log(e)}))},r.a.createElement("div",{className:"login-container"},r.a.createElement("div",{className:"title-container"},r.a.createElement("h1",null,"Sign up")),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{name:"email",ref:t({required:"Required",pattern:{value:/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i,message:"Please enter a valid email address."}}),placeholder:"student@uh.edu"})),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{name:"username",ref:t({required:"Required",max:20}),placeholder:"username"})),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{name:"password",type:"password",placeholder:"\u2022\u2022\u2022\u2022\u2022\u2022\u2022\u2022",ref:t({required:"A password is required.",min:8,max:20})})),r.a.createElement("div",{className:"input-container"},r.a.createElement("input",{name:"passwordConfirmation",type:"password",placeholder:"retype password",ref:t({required:"Please confirm password.",validate:{matchesPreviousPassword:function(e){return s().password===e||"Passwords should match."}}})})),r.a.createElement("div",{className:"submit-btn-group"},r.a.createElement("div",null,r.a.createElement("button",{type:"submit",className:"btn btn-register"},"Sign up"))),r.a.createElement("div",{className:"error-container"},r.a.createElement("p",null,n.password&&n.password.message),r.a.createElement("p",null,n.passwordConfirmation&&n.passwordConfirmation.message),r.a.createElement("p",null,n.email&&n.email.message))))}),p=(t(39),t(10)),E=t.n(p),f=t(11),g=t.n(f),v=t(12),h=t.n(v),b=t(13),N=t.n(b),w=function(){return r.a.createElement("div",{className:"trending-body-container"},r.a.createElement("div",{className:"trending-title-container"},r.a.createElement("h2",null,"Trending Songs")),r.a.createElement("div",{className:"song-container"},r.a.createElement("div",{className:"first"},r.a.createElement("img",{className:"first-song",src:E.a,alt:"rodeo"})),r.a.createElement("div",{className:"second"},r.a.createElement("img",{className:"second-song",src:g.a,alt:"dielit"})),r.a.createElement("div",{className:"third"},r.a.createElement("img",{className:"third-song",src:h.a,alt:"beatles"})),r.a.createElement("div",{className:"fourth"},r.a.createElement("img",{className:"fourth-song",src:N.a,alt:"hendrix"}))))},j=function(){var e=Object(l.useModali)({animated:!0}),a=Object(c.a)(e,2),t=a[0],s=a[1],i=Object(l.useModali)({animated:!0}),o=Object(c.a)(i,2),p=o[0],E=o[1],f=Object(n.useState)(""),g=Object(c.a)(f,2),v=g[0],h=g[1];return Object(n.useEffect)((function(){fetch("/api/hello").then((function(e){return e.text()})).then((function(e){h(e)}))})),r.a.createElement("div",{className:"landing-container"},r.a.createElement("div",{className:"header-container"},r.a.createElement("div",{className:"home-container"},"Coog Music"),r.a.createElement("div",{className:"btn-group"},r.a.createElement("div",null,r.a.createElement("button",{className:"btn btn--1",onClick:s},"Sign in")),r.a.createElement("div",null,r.a.createElement("button",{className:"btn btn--2",onClick:E},"Sign up")),r.a.createElement(m.a.Modal,t,r.a.createElement(u,null)),r.a.createElement(m.a.Modal,p,r.a.createElement(d,null)))),r.a.createElement("div",{className:"content-container"},r.a.createElement("div",{className:"description"},r.a.createElement("div",{className:"desc-text"},r.a.createElement("p",null,"A music streaming platform made for the University of Houston"),r.a.createElement("p",null,"Upload and stream music for other students and alumni to discover."),r.a.createElement("p",null,v))),r.a.createElement("div",{className:"trending-container"},r.a.createElement(w,null)),r.a.createElement("div",{className:"info-container"},r.a.createElement("p",null,"With Coog Music, artists and creators within the University of Houston can easily share and connect with each other through their music."))),r.a.createElement("div",{className:"footer-container"},r.a.createElement("div",{className:"info"},r.a.createElement("h5",null," \xa9 2020, Coog Music, Inc."))))};var x=function(){return r.a.createElement("div",{className:"App"},r.a.createElement(j,null))};i.a.render(r.a.createElement(x,null),document.getElementById("root"))}],[[14,1,2]]]);
//# sourceMappingURL=main.75c200b2.chunk.js.map