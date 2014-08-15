<!doctype html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/index.css">

	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	<div id="title"><h2>Book Shelf</h2></div>
	<div id="nav">
		<div class="line"></div>
		<p>
			<span><a href="javascript:void(0)">HOME</a></span>
			<span><a href="javascript:void(0)">ABOUT ME</a></span>
		</p>
		<div class="line"></div>
	</div>
	<div id="logo">
		<img src="image/logo.png">
	</div>
	<div id="wrapper">
		<div class="slidebar">
			<div class="search_box">
				<form action="#">
					<input type="text" value="Search the blog"></input>
					<input type="submit" value="Search"></input>
				</form>
			</div>
			<div class="tags">
				<b><small>TAGS</small></b>
				<p>
				<span class="tag_small"><a href="javascript:void(0)">CSS</a></span>
				<span class="tag_big"><a href="javascript:void(0)">Git</a></span>
				<span class="tag_small"><a href="javascript:void(0)">Gradle</a></span>
				<span class="tag_small"><a href="javascript:void(0)">Groovy</a></span>
				<span class="tag_big"><a href="javascript:void(0)">Shell</a></span>
				</p>
			</div>
			<div class="recent_posts">
				<b><small>RECENT POSTS</small></b>
				<p><span><a href="javascript:void(0)">Another Usage of "git rease -i"</a></span></p>
				<p><span><a href="javascript:void(0)">Shell Auto Completion Step by Step</a></span></p>
				<p><span><a href="javascript:void(0)">CSS Specific for Internet Explorer</a></span></p>
				<p><span><a href="javascript:void(0)">Git - Squash Your Commmits</a></span></p>
			</div>
		</div>
		<div class="content">
        			<h3>CSS Specific for Internet Explorer</h3>
        			<p>Internet Explorer may be the worst browser for front-end developers. Now I'm working in a pure front-end team and members here spent half of their "styling" time on IE compatibilities. I also heard one Australian online shopping website charges IE users more tax when purchasing their goods, beacause they waste developers' time. Coming back, we still need to struggle with IE issues, so here are three basic ways to specify CSS only for IE, which won't affect other browers badly. I'm not going to introduce why CSS in IE behave differently and how to solve them.</p>
        			<p>#1 IE condition comments</p>
        			<p>IE condition comments are readable by IE and can be targeting on different version of IE.</p>
        			<p>Here[if it IE 8] means targeting IE 8 and below, [if gte IE 8] means greater than of equal.</p>
        			<p>#2 Conditional HTML class</p>
        			<p>This is mostly widely used in our team. Similarly using IE condition comments, but on HTML body rather than CSS referece in head:</p>
        			<p>Therefore in CSS file you can use .ie div for IE specific CSS.</p>
        			<p>#3 IE specific CSS rules.</p>
        			<p>The most tricky one, this is using CSS rules which can only be understood by IE (and also version specified). Here are sample code:</p>
        			<p>Comprehensively, "\9" for IE 8, "*" for IE 7 and "_"for IE 6.</p>
        			<p class="last_paragraph">This entry was posted in <u>Tech</u> and tagged <u>CSS</u> on <u>28/11/2012</u></p>

        </div>
	</div>
	<div id="footer">
		<div class="line"></div>
		<p>Proudly powered by WordPress</p>
	</div>

	<script>
        $(function(){
            searchBooks("${pageContext.request.contextPath}/");
        });
    </script>
</body>
</html>