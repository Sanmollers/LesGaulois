#! /bin/sh
git config user.name "Sanmollers"
git config user.email mollersjean0@gmail.com
echo "Connection as Sanmollers... \n"
read -p "Entrez le message du commit entre \"\" puis la touche Entrer ou la touche Entrer pour l'envoyer en urgence." commit_message
if [ $commit_message -eq "" ]
then
 git add . | git commit -m "push en urgence à relire !" | git push
 echo "push en urgence à relire !"
else
 git add . | git commit -m "$commit_message" | git push
 echo "Votre projet a bien ete \"push\" !"
fi