# Tips for programming languages, softwares, etc  

## Git command  
* List existing remotes  
```
git remote -v
```  

* change remote's URL  
```bash
git remote set-url origin https://github.com/USERNAME/REPOSITORY.git
```  
* force to push to remote repository  
```bash
git push -u origin master -f
```  
* check remote origin name and url  
```
$ git remote -v
> myOrigin ssh://github.com/USERNAME/REPOSITORY.git(fetch)
> myOrigin ssh://github.com/USERNAME/REPOSITORY.git(push)
```  
* Remove the old remote  
```
git remote remove myOrigin
```  
* Add missing remote  
```
git remote add origin ssh://github.com/USERNAME/REPOSITORY.git
```  

