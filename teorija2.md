# 2. del

## 1. Pricakovana vrednost slucajne spremenljivke (matematicno upanje)

- `primer: npr. igralna kocka (3.5) ali binomska (np)`
  - $X\sim \begin{pmatrix}1 && 2 && 3 && 4 && 5 && 6 \\ \frac{1}{6} &&  \frac{1}{6} && \frac{1}{6} && \frac{1}{6} && \frac{1}{6} && \frac{1}{6}\end{pmatrix}$
  - $E(X)=\sum\limits_{i=1}^6 x_i \cdot p_i = 1\cdot \frac{1}{6}+2\cdot \frac{1}{6}+\cdots + 6\cdot \frac{1}{6}=3.5$

<div align="center">

| Porazdelitev          | E(X)                |
| --------------------- | ------------------- |
| $B(p)$                | $p$                 |
| $B(n,p)$              | $np$                |
| $G(p)$                | $\frac{1}{p}$       |
| $P(n,p)$              | $\frac{n}{p}$       |
| $H(R,B,n)$            | $\frac{nR}{R+B}$    |
| $E([a,b])$            | $\frac{a+b}{2}$     |
| $P(\lambda)$          | $\lambda$           |
| $\text{Exp}(\lambda)$ | $\frac{1}{\lambda}$ |
| $\Gamma(n,\lambda)$   | $\frac{n}{\lambda}$ |
| $N(\mu, \sigma)$      | $\mu$               |
| $\chi^2(n)$           | $n$                 |

</div>

- `motivacija za definicijo (utezeno povprecje), tj. tezisce`
  - povprecje vrednosti diskretne spremenljivke (verjetnost $\cdot$ vrednost)
  - utezeno povprecje: $k_1 + \dots+ k_m = N$, $f_i = \dfrac{k_i}{N}$
    $$\overline{x} = \dfrac{x_1k_1 + \dots + x_mk_m}{N} = x_1f_1 + \dots + x_mf_m$$
  - predstavlja $\mu$ pri CLI
    $$E(X)=\sum\limits^n_{i=1}x_i \cdot p_i$$
- `definicija za diskretne slucajne spremenljivke (kdaj obstaja)`
  - diskretna slucjna spremenljivka je slucajna spremenljivka, ki ima stevno zalogo vrednosti
  - $E(X)=\sum\limits^n_{i=1}x_i \cdot p_i$
  - **pogoj** $\sum\limits^n_{i=1} |x_i| \cdot p_i < \infty$
- `definicija za zvezne slucajne spremenljivke (kdaj obstaja)`
  - zvezna slucajna spremenljivka je slucajna spremenljivka ki lahko zavzameo katerokoli vrednost iz nekega intervala
  - $E(X) = \int\limits_{-\infty}^{\infty} x\cdot p_X(x) dx$
  - **pogoj**: $\int\limits_{-\infty}^{\infty} |x|p_X(x)dx < \infty$
- `primer slucajne spremenljivke za katero ne obstaja E(X)`
  - $X\sim p(x) = \frac{1}{\pi (1+x^2)}$ <u>**Caucheyeva porazdelitev**</u>
  - $\int\limits_{-\infty}^{\infty} \frac{x}{\pi (1+x)^2} \rightarrow$ divergira
  - $x_k= (-1)^{k + 1} \dfrac{2^k}{k}$ in $p_k = 2^{-k}$ (primer diskretne ko je $E(X) = \infty$)
- `lastnosti: linearnost, z dokazom za homogenost`
  - **linearnost**: $E(aX+bY)=aE(x)+bE(Y)$
  - **homogenost**: $E(aX)=aE(X)$:
    - `Dokaz`: homogenost in linearnost **integriranja** ter **vsote** (po definiciji)
    - $\sum\limits_{i=1}^{\infty} a\cdot x_i p_{Xi}+ \sum\limits_{i=1}^{\infty} b\cdot y_i p_{Yi}=a\cdot b\sum\limits_{i=1}^{\infty} x_ip_{Xi}+y_ip_{Yi}$
    - E(X) je definirana kot povprecje diskretnih spremenljivk, ce vse to pomnozis s konstanto se mnozi tudi povprecje
- `Skica dokaz aditivnosti E(X+Y) = E(X)+E(Y) = ali Trditev 7.1: E(|XY|) ≤ √E(X2)E(Y 2)`
  - $$E(X + Y) = E(Z) = \int_{-\infty}^{\infty} zp_z(z)dz$$
    $$= \int_{- \infty}^{\infty} z(\int_{- \infty}^{\infty} p(x, z-x))dz= \int_{- \infty}^{\infty}\int_{- \infty}^{\infty} (x + y)p(x,y)dxdy$$
    $$\int_{-\infty}^{\infty}(\int_{-\infty}^{\infty} xp(x,y)dx)dy + \int_{-\infty}^{\infty}(\int_{-\infty}^{\infty} yp(x,y)dx)dy$$
    $$= \int_{-\infty}^{\infty} xp_X(x)dx + \int_{-\infty}^{\infty} yp_X(y)dy$$
    $$=E(X) + E(Y)$$

  - lastnosti vsot/integralov

## 2. Disperzija (razprsenost oz. varianca) slucajne spremenljivke, odklon in standardizacija

- `primeri: npr. binomska (np(1 − p)), enakomerna (b − a)2/12`
<div align="center">

| porazdelitev          | D(X)                                      |
| --------------------- | ----------------------------------------- |
| $B(p)$                | $p(1-p)$                                  |
| $B(n,p)$              | $np(1-p)$                                 |
| $G(p)$                | $\frac{1-p}{p^2}$                         |
| $P(n,p)$              | $\frac{n(1-p)}{p^2}$                      |
| $H(R,B,n)$            | $\frac{nRB\cdot (R+B-n)}{(R+B)^2(R+B-1)}$ |
| $P(\lambda)$          | $\lambda$                                 |
| $\text{Exp}(\lambda)$ | $\frac{1}{\lambda^2}$                     |
| $\Gamma(n,\lambda)$   | $\frac{n}{\lambda^2}$                     |
| $E([a,b])$            | $\frac{(b-a)^2}{12}$                      |
| $\chi^2(n)$           | $2n$                                      |

</div>

- `definicija s pricakovano vrednostjo in obstoj`
  - **Definicija**: $D(X) = E((X-E(X))^2)=E(X^2)-E^2(X)$
  - $D(X)\geq 0$
  - **Pogoj**: nesme biti neskoncna
- `D(X) = 0 ⇐⇒ X je konstanta`
  - $D(X)=E((X-E(X))^2)=E((X-X)^2)=E(0)=0$
  - Torej ce je npr $P(X=a)=c$, Bo odklon vseh ostalih posameznih vzorcev od povprecja = 0;
- `lastnosti (aditivnost za neodvisni slucajni spremenljivki)`
  - Aditivnost disperzije: $D(X+Y)=D(X)+D(Y)+2 \text{Cov}(X,Y)$
    - ce sta X in Y neodvisni: $D(X+Y)=D(X)+D(Y)$
- `Standardizacija, slucajne spremenljivke in njena pricakovana vrednost oz. odklon`
  - Slucajno spremenljiko X **standardiziramo** s transformacijo
    $$X_s=\frac{X-\mu}{\sigma}$$
    - $E(X)=\mu$ in $D(X)=\sigma^2$
  - **Velja**:
    - $E(X_s)=E(\frac{X-\mu}{\sigma})=\frac{E(X-\mu)}{\sigma}=\frac{\mu-\mu}{\sigma}=0$
    - $D(X_s)=D(\frac{X-\mu}{\sigma})=\frac{D(X-\mu)}{\sigma^2}=\frac{\sigma^2+0}{\sigma^2}=1$
  - Standardizacija slucajne spremenljivke povzroci da vsaka spr. enako vpliva na pricakovano vrednost (npr. ce smo neke rezultate zmerili z razlicinimi merili, to nam pomaga za primerjavao razlicnih tipov spremenljivk)
- `Skica dokaza zveze “kosinusnu izrek”`
  - TODO

## 3. Korelacija in kovarianca

- `meri algebraicno povezanost dveh stevilskih slucajnih spremenljivk`
  - predstavlja mero povezanosti med dvema spremenljivkama
    - os y predstavlja slucajno spremenljiko Y
    - os x predstavlja slucajno spremenljivko X
    <p align="center"><img src="./images/korelacija.png" width="80%"></p>
- `definicija kovariance in njen obstoj (CS E(|XY|) ≤ √E(X2)E(Y2))`
  - **Kovarianca** $\text{Cov}(X,Y)=E((X-E(X))\cdot(Y-E(Y)))=E(XY)-E(X)E(Y)$
  - $|Cov(X,Y)| \leq \sqrt{D(X)D(Y)}=\sigma_X \sigma_Y$
  - spremenljivki za katerei velja da:
    - $\text{Cov}(X,Y) \neq 0$ sta **korelirani**
      - $\text{Cov}(X,Y) > 0 \rightarrow X\uparrow Y\uparrow$ (pozitivno korelirani)
      - $\text{Cov}(X,Y) < 0 \rightarrow X\uparrow Y\downarrow$ (negativno korelirani)
    - $\text{Cov}(X,Y) = 0$ sta **nekorelirani**
  - **Primer** $X \equiv$ telesna visina osebe, $Y\equiv$ teza osebe
    - X in Y sta korelirani (pozitivno)
- `lastnosti korelacije`
  - Ce sta slucajni spremenljivki X in Y neodvisni $\rightarrow E(XY)=E(X)E(Y) \rightarrow \text{Cov}(X,Y)=0$
- `definicij korelacijskega koeficienta, vedno na [−1, 1]`
  - $r(X,Y)= \frac{\text{Cov}(X,Y)}{\sigma(X)\sigma(Y)}=\frac{E(XY)-E(X)E(Y)}{\sqrt{E(X^2)-E^2(X)}\cdot\sqrt{E(Y^2)-E^2(Y)}}$
  - $r(X,Y)=0\Leftrightarrow$ X in Y nekorelirani
  - $r(X,Y)=\pm 1 \Leftrightarrow$ X in Y sta v linearni zvezi
- `kdaj lahko zakljucimo linearno odvisnost`
  - Dve slucajni spremenljivki sta **linearno odvisni** ce lahko eno zapisemo kot linearno funkcijo druge $\rightarrow$
    korelacijski koeficient med njima bo 1 ali -1.
- `Ali lahko izracunamo korelacijo iz disperzij (tj. D(X), D(Y) in D(X+Y))`
  - $D(X+Y)= D(X)+D(Y)+2\text{Cov}(X,Y)$
- `kovariancna matrika`
  - Naj bo X stolpicni vektor $X=(X_1,X_2,...X_n)^T$ (kjer so $X_i$ slucajne spremenljivke)
  - Potem definiramo kovariancno matriko $K_{XX}$, $(i,j)$-ti element je (kovarianca):
    - $K_{X_iX_j}=\text{cov}[X_i, X_j]= E[(X_i-E[X_i])(X_j-E[X_j])]$
  - Kovariancna matrika je **simetricna**
  - Diagonalne vrednosti so **disperzije** $K_{X_iX_i}=E((X_i-E(X_i))(X_i-E(X_i)))=E((X_i-E(X_i))^2)=D(X_i)$
- `povezava z regresijsko premico`
  - $K_{YX}K^{-1}_ {XX}$ je matrika regresijskih koeficientov

## 4. Slucajni vektorji 2D, 3D, nD

- `definicija slucajnega vektorja (primer)`
  - Slucajni vektor je n-terica slucajnih spremenljiv $X=(X_1,....,X_n)$
  - Primer slucajni vektor $X=(X_1, X_2)$:
    - $X_1$ stevilo metov ko pade sestica, pri 3 metih kocke
    - $X_2$ stevilo metov ko pade stevilo manjse od 3, pri 3 metih kocke
- `definicija porazdelitvene funkcije (primer)`
  - $F(x_1,x_2,...,x_n)=P(X_1 \leq x_1, X_2\leq x_2, \dots, X_n \leq  x_n)$
  - Primer za metanje kock
    - $F_{X,Y}(x,y)=P(X\leq x, Y\leq y)= \sum\limits_{i=1}^{\infty}\sum\limits_{j=1}^{\infty}p_{ij}\cdot 0/1$ (1 ce je i <= x in j <= y 0 sicer
  - Za zvezni vektor uporabimo integrale
    - $F_{X,Y}(x,y)=P(X\leq x, Y\leq y)=\int\limits^x_{-\infty}\int\limits^y_{-\infty}p_{X,Y}(x,y)dxdy$
- `verjetnostna in kontingencna tabela, verjetnostna funkcija (primer)`
  - __verjetnostna tabela__
    $$
    \begin{array}{c|cccc|c}
        X,Y & y_1 & y_2 & \dots & y_m & X \\
        \hline
        x_1 & p_{11} & p_{12} & \dots & p_{1m} & p_1 \\
        x_2 & p_{21} & p_{22} & \dots & p_{2m} & p_2 \\
        \dots & \dots & \dots  & \dots & \dots & \dots \\
        x_n & p_{n1} & p_{n2} & \dots  & p_{nm} & p_n \\
        \hline
        Y & q_1 & q_2 & \dots & q_m & 1
    \end{array}
    $$
    - kjer:
      - $P(X=x_i, Y=y_j)=p_{ij}$
      - $P(X=x_i)=p_i$, **robna porazdelitev** za X
      - $P(Y=y_i)= q_i$, **robna porazdelitev** za Y
  - __kontigencna tabela__ (modelira nakup avtomobila)

    | starost         | >20 | <20 | sum |
    |-----------------|-----|-----|-----|
    | kupil avtomobil | 80  | 20  | 100 |
    | ni kupil        | 100 | 50  | 150 |
    | sum             | 180 | 70  | 250 |

- `gostota verjetnosti (primer)`
  - funkciji $p_{X,Y}$ pravimo (dvorazsezna) gostota verjetnosti (doloca vektor zveznih spremenlijvk)
  - npr: $p_{X,Y}(x,y)=\frac{1}{4}$ z zalogo vrednosti $x\in [0,2], y\in [0,2]$
- `robne porazdelitvene funkcije`
  - Funkciji $F_i(x_i)=F(\infty,\dots,\infty,x_i,\infty,\dots,\infty)$ pravimo **robna porazdelitvena funkcija** spremenljivke $X_i$
  - Npr za diskretne
    - $P(X=x_i)=\sum\limits_{j=1}^\infty p_{ji}$
    - $P(Y=y_i)=\sum\limits_{j=1}^{\infty}p_{ij}$
- `Ali se da iz verjetnostne funkcije slucajnega vektorja ugotoviti neodvisnost njegovih komponent?`
  - **DA**, npr za diskretni vektor:
    - $\forall x,y: P(X=x, Y=y)=P(X=x)P(Y=y)$
  - npr, za zvezni vektor
    - $\forall x,y, X\leq x \land Y\leq y: p_{X,Y}(x,y)=p_X(x)p_Y(y)$
- `zveza med gostoto verjetnosti in porazdelitveno funkcijo`
  - za dve spremenljivki (na n spremenljivk trivialen prehod):
    - $F_{X,Y}(x,y)=P(X\leq x, Y\leq y) = \int\limits^x_{-\infty}\int\limits^y_{-\infty}p_{X,Y}(x,y)dxdy$
- `definicija kvadranta in izpeljava formule pravokotnik`
  - Naj bo $A(x,y)=\{(u,v)\in \mathbb{R}^2: u\leq x \land v \leq y\}$ (levi spodnji kvadrant glede na (x,y))
  - Naj porazdelitvena funkcija opisuje verjetnost da je slucajna tocka (X,Y) v mnozici A(x,y)
    $$F(x,y)=p(X\leq x, Y\leq y)=P(X,Y)\in A(x,y)$$
  - Tedaj je verjetnost da je slucjana tocka (X,Y) v pravokotniku $(a,b]\times (c,d]$ enaka:
    $$P(X,Y)\in (a,b]\times (c,d]=F(b,d)-F(a,d)-F(b,c)+F(a,c)
- `neodvisnost`
  - $P(X=x)\cdot P(Y=y) = P(X=x,Y=Y)$

## 5. Polinomska porazdelitev

- `primeri`
  - Imamo volitve z 3 izbirami (A,B,C). Kandidat A prejme 20% glasov, B 30%, C 50% glasov. Ce so glasovalci izbrani
    randomly, kaksna je verjetnost da bomo izmed 6 izbranih izbrali natanko enega volivca za kandidata A, dva za B in tri za C.
    $$X\sim P(6;0.2,0.3,0.5)$$
    $$P(A=1,B=2,C=3)=\frac{6!}{1!2!3!}(0.2^1)(0.3^2)(0.5^3)$$
  - Iz kupa igralnih kart (52) na slepo izberemo eno karto in jo nato vrnemo nazaj. Postopek ponovimo 5-krat. Koliksna je verjetnost da bomo videli dvakrat srce, po enkrat pa pika kriza in karo
    $$X\sim P(5, 0.25, 0.25, 0.25, 0.25)$$
    $$P(X_1=2, X_2=1, X_3=1, X_4=1)=\frac{5!}{2!1!1!1!}0.25^2 0.25^1 0.25^1 0.25^1=0.05859$$
- `definicija`
  - Polinomska porazdelitev $\sim P(n;p_1,\dots,p_r)$ je dolocena s predpisom
    - $P(X_1=k_1,\dots, X_r=k_r)=\frac{n!}{k_1!\cdots k_r!}p_1^{k_1}\cdots p_r^{k_r}$
- `zaloga vrednosti`
  - $\sum\limits_{i=1}^r p_i = 1$
  - $\sum\limits_{i=1}^{r} k_i = n$
- `verjetnostna funkcija (zapisi pi,j,...,k)`
  - Polinomska porazdelitev $\sim P(n;p_1,\dots,p_r)$
    - $\sum p_i = 1$, $\sum k_i = n$
    - spremenljivke $X_i$ opisujejo stevilo pojavitev rezultata i
  - $P(X_1=k_1, \dots, X_r=k_r)=\frac{n!}{k_1! \cdots k_r!}p_1^{k_1}\cdots p_r^{k_r}$
- `povezava z binomsko`
  - za r=2 dobimo binomsko spremenjivko $B(n,p)=P(n,p,q)$
- `pricakovana vrednost in disperzija`
  - $E(X_i)= np_i$
  - $D(X_i)=np_i(1-p_i)$

## 6. Funkcije slucajnih spremenljivk

- `primeri enostavnih funkcij`

  - Imamo $X\sim \begin{pmatrix} -1 & 0 & 1 \\ \frac{1}{2} & \frac{1}{3} & \frac{1}{6} \end{pmatrix}$
  - Potem $5X \sim \begin{pmatrix} -5 & 0 & 5 \\ \frac{1}{2} & \frac{1}{3} & \frac{1}{6} \end{pmatrix}$
  - Imamo podano porazdelitveno shemo
    $$
    \begin{array}{c|ccc|c}
      Y,X & 0 & 1 & 2 & X\\
      \hline
      0 & \frac{2}{50} & \frac{2}{50} & \frac{1}{50} & \frac{5}{50} \\
      1 & \frac{6}{50} & \frac{6}{50} & \frac{3}{50} & \frac{15}{50}\\
      2 & \frac{12}{50} & \frac{12}{50}  & \frac{6}{50} & \frac{30}{50} \\
      \hline
      Y & \frac{20}{50} & \frac{20}{50} & \frac{10}{50} & 1
    \end{array}
    $$
  - $Z= X^2 \sim \begin{pmatrix} 0 & 1 & 4 \\ 0.1 & 0.3 & 0.6\end{pmatrix}$
  - $W=X+Y \sim \begin{pmatrix} 0 & 1 & 2 & 3 & 4 \\ 0.04 & 0.16 & 0.38 & 0.30 & 0.12 \end{pmatrix}$
    - $P(W=0)=P(X=0, Y=0)=0.04$
    - $P(W=1)= P(X=0,Y=1)+P(X=1, Y=0)= 0.16$
    - $P(W=2)= P(X=0, Y=2) + P(X=1,Y=1) + P(X=2, Y=0)=0.38$
    - $P(W=3)=P(X=1, Y=2)+P(X=2,Y=1)=0.30$
    - $P(W=4)= P(X=2,Y=2)=0.12$

- `definicija in povezava med ustreznima porazdelitvenima funkcijama`
  - naj bo $Y=g(X)$
  - $F_Y(y)=P(g(X)\leq y)=\Bigg\{\begin{matrix} P(X\leq g^{-1}(y)), & g^{-1} \text{ narascujoca} \\ P(X\geq g^{-1}(y)), & g^{-1} \text{ padajoca} \end{matrix}$
  - __Primer__: naj bo $Y=X^2$
    - $P(X^2\leq y)=P(|X|\leq \sqrt{y})=P(-\sqrt{y} \leq X \leq \sqrt{y})$
- `zveza med gostatami verjetnosti`
  - $f_Y(y)=f_X(g^{-1}(y)) \left| \frac{dg^{-1}(y)}{dy}\right|$
- `formula za pricakovano vrednost`
  - diskretna:
    $$E(f(X))=\sum\limits^{\infty}_{k=0} f(x_k)\cdot p_k$$
  - zvezna
    $$E(f(X))=\int\limits^{\infty}_{-\infty} f(x)\cdot p_X(x) dx$$
- `neodvisnost`
  - Ce so $X_1,X_2,\dots, X_n$ neodvisne standardizirane normalne slucajne spremenljivke, je slucajna spremenljivka
    $Y=X_1^2+\cdots+X^2_n$ porazdeljena po $\chi^2(n)$
- `izpeljava zveze med N(0, 1) in χ2(1)`
  - Naj bo X standardizirana normalna spremenljivka z $p_X(x)=\frac{1}{\sqrt{2\pi}}e^{-\frac{x^2}{2}}$
  - nastavimo $Y=X^2$
    - $g^{-1}(x)=\sqrt{x}$
    - $\frac{dg^{-1}}{dx}=\frac{1}{2} x^{-\frac{1}{2}}$
  - $p_Y(x)=p_X(g^{-1}(x))\cdot \frac{dg^{-1}}{dx}=\frac{1}{\sqrt{2\pi}}e^{-\frac{x}{2}}\cdot \frac{1}{2} x^{-\frac{1}{2}}=\frac{1}{\sqrt{2\pi x}}e^{-\frac{x}{2}}$
  - Dobili smo $\chi^2(1)$
      - $X_i \sim N(0,1)$ 
      - $\chi^2(k)=X_1^2+\dots + X_k^2$

## 7. Funkcije slucajnih vektorjev

- `primer`
- `definicija`
  - Naj bo $f:(x,y)\rightarrow (u,v)$ transofrmacija slucajnega vektorja (X,Y) v slucajni vektor (U,V) dolocena z zvezama
    $U=u(X,Y)$ in $V=v(X,Y)$. Porazdelitveni zakon za nov slucajni vektor $(U,V)$ je
  - $F_{U,V}(u,v)=P(U < u, V < v)=P((U,V)\in A(u,v))=P(X,Y)\in f^{-1}(A(u,v))$
- `definicija konvolucije`
  - Definiramo $Z=X+Y$, kjer je $(X,Y)$ zvezno porazdljen slucajni vektor z gostoto $p(x,y)$ verjetnostna funkcija (diskretni)
  - $F_Z(z)=P(Z\leq z)=P(X+Y \leq z)=\int \int_{x+y\leq z} p(x,y) dx dy=\int\limits^{\infty} _ {-\infty}dx \int\limits_{-\infty}^{z-x}p(x,y)dy$
  - za slucajni dobimo gostoto verjetnosti:
    $$p_Z(z)=\int\limits^\infty_{-\infty}f_{XY}(x,z-x)dx$$
  - za diskretni pa dobimo
    $$P(Z=z)=\sum\limits^\infty_{k=-\infty} P(X=k)P(Y=z-k)$$
    - ce sta neovidsni pa
      $$p_Z(z)=\int\limits^\infty_{-\infty}p_X(x)p_Y(z-x)dx$$
  - In tej formuli pravimo **konvolucija** slucajnih distribucij
- `uporaba za vsoto dveh neodvisnih normalnih porazdelitev`
  - $X\sim N(\mu_X, \sigma^2_X)$
  - $Y\sim N(\mu_Y, \sigma^2_Y)$
  - $Z = X + Y \rightarrow Z\sim N(\mu_X+\mu_Y, \sigma_X^2+\sigma_Y^2)$
- `uporaba za vsoto dveh neodvisnih Gama porazdelitev`
  - $X\sim \Gamma(n_1, \lambda)$, in $Y\sim \Gamma(n_2,\lambda)$ potem $X+Y\sim \Gamma(n_1+n_2, \lambda)$
- `formula za pricakovano vrednost produkta`
  - $E(XY)= E(E(XY | Y))$
  - ce sta neovidsni
    - $E(XY)=E(X)\cdot E(Y)$
- `Jacobijeva determinanta in prehod na nove spremenljivke`
  - Ce je funkcija f bijektivna z zveznimi parcialnimi odvodi lahko nadaljujemo
    $$F_{U,V}(u,v)= \int\int_{A(u,v)} p(x(u,v), y(u,v)) \left| \text{det} \begin{pmatrix} \frac{\partial u}{\partial x} & \frac{\partial u}{\partial y} \\ \frac{\partial{v}}{\partial x}  & \frac{\partial v}{\partial y}\end{pmatrix}\right| du dv$$

## 8. Pogojna porazdelitev

- `primer za diskretni slucajni vektor`
  - Imamo porazdelitveno shemo. Zapisi pogojno verjetnostno porazdelitev slucajne spremenljivke X, glede na pogoj y=2
      <p align="center"><img src="./images/pogojna-shema.png" width="60%"></p>
  - Verjetnost v vrstici pri $y=2$, moramo deliti s $P(Y=2) = 0.2$
    $$X|y=2\sim \begin{pmatrix}1 & 2 & 3 & 4 \\ 0.25 & 0.5 & 0.25 & 0 \end{pmatrix}$$
- `definicija v diskretnem primeru in v zveznem primeru`
  - diskretni primer:
    - Naj bo B nek mogoc dogodek $P(B)>0$. Potem lahko vpeljemo **pogojno porazdelitveno funkcijo**:
      $$F(x|B)=P(X\leq x|B)=\frac{P(X\leq x,B)}{P(B)}$$
  - zvezni primer:
    - Postavimo $B=(y<Y\leq y+h)$ za $h>0$ in zahtevajmo $P(B)>0$
      $$F_X(x|B)=P(X\leq x |B)=\frac{P(X\leq x, y<Y \leq y+h)}{P(y\leq Y < y+h)}=\frac{F(x,y+h)-F(x,y)}{F_Y(y+h)-F_Y(y)}$$
- `pogojna porazdelitvena funkcija v obeh primerih`
  - diskretni primer:
    $$F_X(x|y_k)=F_X(x|Y=y_k)=P(X\leq x | Y = y_k)=\frac{P(X<x,Y=y_k)}{P(Y=y_k)}=\frac{1}{q_k}\sum\limits_{x_i\leq x} p_{ik}$$
  - zvezni primer:
    - ce obstaja limita za ($h\rightarrow 0$)
      $$F_X(x|y)=F_X(x|Y=y)=\lim\limits_{h\rightarrow 0}\frac{F(x,y+h)-F(x,y)}{F_Y(y+h)-F_Y(y)}$$
    - imenujemo jo pogojna porazdelitvena funkcija slucajne spremenljivke X glede na dogodek (Y=y)
- `izpeljava pogojne verjetnostne funkcija v diskretnem primeru`
  - Vpeljimo pogojno verjetnostno funkcijo $p_{i|k}=\frac{p_{ik}}{q_k}$. Tedaj je $F_X(x|y_k)=\sum\limits_{x_i\leq x}p_{i|k}$
- `izpeljava pogojne gostote v zveznem primeru`
  - Naj bosta gostoti $p(x,y)$ in $p_Y(y)> 0$ zvezni. Tedaj je:
    $$F_X(x|y)=\lim\limits_{h\rightarrow 0}\frac{\frac{F(x,y+h)-F(x,y)}{h}}{\frac{F_Y(y+h)-F_Y(y)}{h}}=\frac{\frac{\partial F}{\partial y}(x,y)}{F_Y'(y)}=\frac{1}{p_Y(y)}\int\limits^x_{-\infty}p(u,y)du
- `primer za zvezni slucajni vektor`

## 9. Momenti in kvantili

- Momenti pokazejo lastnosti vzorca - povprecno vrednost, razprsitev, asimetrijo in sploscenost
- `katere momente poznas`

  - **Zacetne** (merimo od 0)
    - Consider the following dataset [12 14 14 17 18]
    - Consider alternate dataset \[15 15 15 15 15\] (enak prvi moment)
    - Each item represents distance from 0
    - average distance from zero: $\frac{\Sigma x_i}{n}\rightarrow$ **prvi moment** = $\mu_1=15$ predstavlja **povprecje**
    - average square distance fom zero : $\frac{\Sigma x_i^2}{n}\rightarrow$ **drugi moment** = $\mu_2=229.8$ (alternate data set ima $\mu_2 =225$)
    - $\frac{\Sigma x_i^3}{n}$ **tretji moment**
    - $\frac{\Sigma x_i^4}{n}$ **cetrti moment**
  - **Centralne** (merimo od sredine)
    - average square distance from povprecna vrednost $\frac{\Sigma(x_i-\mu_1)^2}{n}\rightarrow$ **centriran drugi moment** predstavlja varianco $\sigma^2$
    - $\frac{\Sigma(x_i-\mu_1)^3}{n}\rightarrow$ **centriran tretji moment** (asimetrija skewness)
    - $\frac{\Sigma(x_i-\mu_1)^4}{n}\rightarrow$ **centriran cetrti moment** (sploscenost, kurtosis)
  - **Standardizirane**
    - $\frac{1}{n}\frac{\Sigma(x-\mu)^3}{\sigma^3}$ (standardizeran tretji moment)
    - $\frac{1}{n}\frac{\Sigma(x-\mu)^4}{\sigma^4}$ (standardizeran cetrti moment)

- `definicija momenta reda k glede na tocko a`
  - $m_k(a)=E((X-a)^k)$
  - Moment obstaja, ce obstaja pricakovana vrednost, ki ni neskoncna $E(|X-a|^k) < \infty$
- `zacetni moment, centralni moment`
  - zacetni moment ko je a =0
  - centralni moment ko je a = povprecna vrednost
- `lastnosti`
  - Ce obstaja centralni moment reda n, potem obstaja vsi momenti reda k, $k\leq n$
  - Ce obstaja zacetni moment reda n, potem obstajaju tudi centralni momenti reda n za $\forall a \in \mathbb{R}$
- `definicija kvantila`
  - Kadar spremenljivka nima momentov uporabimo kvantile.
  - Kvantili so "linije" ki razdelijo podatke v skupine enake velikosti
  - Mediana je drugi kvantil (ker polovica podatkov manse polovica vecje)
  - Percentili so kvantili ki delijo podatke v 100 skupine enake velikosti
- `povezava z inverzom porazdelitvene funkcije`
  - TODO

## 10. Studentova porazdelitev  t-test
- [why](https://www.youtube.com/watch?v=32CuxWdOlow)
- `Primer1`
  - Povprecna teza 20 studentov je bila 165lbs z vzorcnim standardnim odklonom 4.5. Konstruiraj 95% interval zaupanja za populacijsko povprecje.
  - $\overline{x}=165$, $n=20$, $s=4.5$
  - Ker __nimamo standardnega odklona populacije__ $\sigma$, ne moremo izracunati normalne porazdelitve, ampak uporabimo studentovo
    - Poleg tega imamo tudi $n\leq20$ (za normalno rabimo $n\geq30$)
  - $\mu \rightarrow \overline{x} \pm t_{n-1, \alpha/2}$
    - $n-1$ = degrees of freedom = 19
    - $\frac{\alpha}{2}= \frac{0.05}{2}=0.025$
    - $t_{19, 0.025}$ = pogledamo v tabeli = $2.093$
  - $\mu \rightarrow 165 \pm 2.093 (\frac{4.5}{\sqrt{20}})=165\pm 2.106$
  - Dobili smo 95% interval zaupanja $I_\mu=\left[ 162.894, 167.106\right]$
    - z 95% lahko recemo da je povprecna teza v tem interavlu
- `Kako lahko pridemo do te porazdelitve?`
  - Uporablja se kadar imamo na voljo majhno stevilo podatkov, in je priblizek normalne porazdelitve
  - Pridemo preko naslednjega obrazca:
  - $$t_{n-1,\alpha}=\frac{\overline{x}-\mu}{s/\sqrt{n}}$$
  - Podbna normalni z "debelimi kraki" (vecja dispersija - manj podatkov - mansa zaneslivost)
  - za $n>30$ je ze skor enaka z-statistiki (normalni porazdelitvi)
  - $Z_X = \mathbb{R}$
  <p align="center"><img src="./images/student-distribution.png" width="90%"></p>
- `gostota verjetnosti`
$$p(x)=\frac{(1+\frac{x^2}{n-1})^{-\frac{n}{2}}}{\sqrt{n-1}B(\frac{n-1}{2}, \frac{1}{2})}$$
- `definicja beta funkcije`
    $$B(x,y)=\frac{\Gamma(x)\Gamma(y)}{\Gamma(x+y)}=B(y,x)$$
- `posebne vrednosti beta funkcije`
$$B(\frac{1}{2}, \frac{1}{2})=\pi$$
$$B(n_1,n_2)=\frac{(m-1)!(n-1)!}{(m+n-1)!} \text{ za } n_1, n_2 \in \mathbb{N}$$
- `katero porazdelitev dobimo za eno prostostno stopnjo in katero, ce je stivlo prosotstnih stopenj dovolj veliko`
    - __ena prostostna stopnja__: Caucheyeva porazdelitev
    - __dovolj veliko stevilo prostostnih stopenj__: Normalna porazdelitev

## 11. Fisherjeva porazdelitev f-test
- `kako lahko pridemo do te porazdelitve primer`

Recimo da imamo dve populaciji. Populacijo1 bomo primerjali z Populacijo2.
Recimo da naredimo __IQ__ test na obeh populacijah. Na vzorcih iz obeh populacij izracunamo vzorcno povprecje ter  (vzorcni odklon) $s_1^2$ ter $s_2^2$ 
- <u>Primerjali bomo dva vzorcna odklona</u>
- __Testna statistika__ (Fisherjeva) je $F=\frac{S_1^2}{S_2^2}$
    - $s_1^2$ dobimo iz $n$ vzorcev 1. populacije
    - $s_2^2$ dobimo iz $m$ vzorcev 2. populacije
- `F-distribution, parametri`
    - $F(n, m)=\frac{\chi^2(n) / n}{\chi^2(m) / m}$
        - $n$ prostostne stopnje prve $\chi^2$ spremenljivke
        - $m$ prostostne stopnje druge $\chi^2$ spremenljivke
    - $Z_F = \mathbb{R}^+$
        - oblika odvisna od prostnostnih stopenj obeh vzorcov
    <!-- <p align="center"><img src="./images/f-distribution.png" width="60%"></p> -->
- `definicija - verjetnostna funkcija`
    $$p(x)=\frac{m^{\frac{3}{2}}n^{\frac{n}{2}}}{B(\frac{m}{2},\frac{n}{2})}\cdot \frac{x^{\frac{(m-2)}{2}}}{(n+mx)^{\frac{m+n}{2}}}$$
- `beta funkcije`
    $$B(x,y) = \frac{\Gamma(x)\Gamma(y)}{\Gamma(x+y)}=B(y,x)$$ 
    $$B(\frac{1}{2}, \frac{1}{2})= \pi$$
- `se kaksne lastnosti fisherjeve porazdelitve`
<div align="center">

| Statisticni parameter | enacba |
| - | - | 
| Pricakovana vrednost $\mu$ | $\frac{m}{m-2}, m>2$
| Modus | $\frac{n-2}{n}\cdot \frac{m}{m+2}$
| varianca | $\frac{2m^2\cdot(n+m-2)}{n(m-2)^2(m-4)}$|

</div>
